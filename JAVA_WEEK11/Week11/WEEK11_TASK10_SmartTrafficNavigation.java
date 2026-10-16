import java.util.Arrays;
import java.util.PriorityQueue;

public class WEEK11_TASK10_SmartTrafficNavigation {
    static class RouteNode {
        int node;
        int distance;

        RouteNode(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    public static int shortestRoute(int[][] roads, int start, int end) {
        int n = 6;
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(graph[i], Integer.MAX_VALUE / 4);
            graph[i][i] = 0;
        }

        for (int[] road : roads) {
            int from = road[0];
            int to = road[1];
            int weight = road[2];
            graph[from][to] = Math.min(graph[from][to], weight);
            graph[to][from] = Math.min(graph[to][from], weight);
        }

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        PriorityQueue<RouteNode> queue = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        queue.add(new RouteNode(start, 0));

        while (!queue.isEmpty()) {
            RouteNode current = queue.poll();
            if (current.distance > dist[current.node]) {
                continue;
            }
            if (current.node == end) {
                return current.distance;
            }

            for (int next = 0; next < n; next++) {
                if (graph[current.node][next] != Integer.MAX_VALUE / 4) {
                    int newDistance = current.distance + graph[current.node][next];
                    if (newDistance < dist[next]) {
                        dist[next] = newDistance;
                        queue.add(new RouteNode(next, newDistance));
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] roads = {
                {0, 1, 5},
                {0, 2, 10},
                {1, 2, 2},
                {1, 3, 4},
                {2, 3, 1},
                {2, 4, 7},
                {3, 4, 3},
                {3, 5, 8},
                {4, 5, 2}
        };

        int start = 0;
        int end = 5;

        System.out.println("Fastest route cost: " + shortestRoute(roads, start, end));
    }
}

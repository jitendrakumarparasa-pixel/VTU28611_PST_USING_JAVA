import java.util.*;

public class W7_T10_ThroneInheritance {

    static class ThroneInheritance {

        String king;
        HashMap<String, String> parent;
        HashMap<String, List<String>> children;
        HashSet<String> dead;

        public ThroneInheritance(String kingName) {

            king = kingName;

            parent = new HashMap<>();
            children = new HashMap<>();
            dead = new HashSet<>();

            children.put(kingName, new ArrayList<>());
        }

        public void birth(String parentName, String childName) {

            parent.put(childName, parentName);

            if (!children.containsKey(parentName)) {
                children.put(parentName, new ArrayList<>());
            }

            children.get(parentName).add(childName);

            children.put(childName, new ArrayList<>());
        }

        public void death(String name) {

            dead.add(name);
        }

        public List<String> getInheritanceOrder() {

            List<String> result = new ArrayList<>();

            dfs(king, result);

            return result;
        }

        private void dfs(String name, List<String> result) {

            if (!dead.contains(name)) {
                result.add(name);
            }

            for (String child : children.get(name)) {
                dfs(child, result);
            }
        }
    }

    public static void main(String[] args) {

        ThroneInheritance obj =
            new ThroneInheritance("king");

        obj.birth("king", "andy");
        obj.birth("king", "bob");
        obj.birth("king", "catherine");

        obj.birth("andy", "matthew");
        obj.birth("bob", "alex");
        obj.birth("bob", "asha");

        System.out.println(obj.getInheritanceOrder());

        obj.death("bob");

        System.out.println(obj.getInheritanceOrder());
    }
}
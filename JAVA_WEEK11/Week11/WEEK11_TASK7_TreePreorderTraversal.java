import java.util.ArrayList;
import java.util.List;

public class WEEK11_TASK7_TreePreorderTraversal {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static void preorder(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.value);
        preorder(root.left, result);
        preorder(root.right, result);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> result = new ArrayList<>();
        preorder(root, result);

        System.out.println("Preorder traversal: " + result);
    }
}

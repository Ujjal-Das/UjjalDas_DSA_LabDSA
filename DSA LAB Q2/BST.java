import java.util.HashSet;

public class BST {
    private static Node root;

    public static boolean findPairWithSum(Node node, int targetSum, HashSet<Integer> set) {
        if (node == null)
            return false;

        if (findPairWithSum(node.left, targetSum, set))
            return true;

        if (set.contains(targetSum - node.data)) {
            System.out.println("Pair found: (" + (targetSum - node.data) + ", " + node.data + ")");
            return true;
        }

        set.add(node.data);

        return findPairWithSum(node.right, targetSum, set);
    }

    public static void main(String[] args) {
        root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        int targetSum = 130;
        HashSet<Integer> set = new HashSet<>();
        if (!findPairWithSum(root, targetSum, set)) {
            System.out.println("Pair not found");
        }
    }
}

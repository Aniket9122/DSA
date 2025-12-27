package Trees;

public class BSTOperations {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);
        bst.add(10);
        bst.add(55);
        bst.add(90);
        bst.add(71);
        bst.add(72);

        System.out.println("=== Original Tree (Inorder) ===");
        bst.inorder();
        bst.height();
        // Test Case 1: Delete a leaf node (10)
        // System.out.println("\n=== After deleting leaf node 10 ===");
        // bst.delete(10);
        // bst.inorder();

        // Test Case 2: Delete a node with one child (60 has only left child 55)
        // System.out.println("\n=== After deleting node with one child 60 ===");
        // bst.delete(80);
        // bst.preorder();

        // Test Case 3: Delete a node with two children (30)
        System.out.println("\n=== After deleting node with two children 30 ===");
        bst.delete(70);
        bst.preorder();
    }
}

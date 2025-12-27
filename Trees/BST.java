package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

    private Node root;

    BST() {
        root = null;
    }

    public void add(int item) {
        if (root != null) {
            root = add(this.root, item);
        } else {
            this.root = new Node(item);
        }
    }

    public Node add(Node node, int item) {
        if (node == null) {
            return new Node(item);
        } else {
            if (item < node.item) {
                node.left = add(node.left, item);
            } else {
                node.right = add(node.right, item);
            }
            return node;
        }
    }

    public void preorder() {
        System.out.println("Traversing tree in preorder:- ");
        preorder(root);
    }

    private void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.item);
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder() {
        System.out.println("Traversing tree in inorder:- ");
        inorder(root);
    }

    private void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(node.item);
        inorder(node.right);
    }

    public void postorder() {
        System.out.println("Traversing tree in postorder:- ");
        postorder(root);
    }

    private void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.item);
    }

    public void BFS() {
        Queue<Node> queue = new LinkedList<>();
        Node node;
        queue.add(root);
        System.out.println("Traversing tree in BFS:- ");
        while (!queue.isEmpty()) {
            node = queue.poll();
            System.out.println(node.item);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public void leafNodesCount() {
        System.out.println("Leaf Nodes in the tree : " + leafNodesCount(root));
    }

    private int leafNodesCount(Node node) {
        int left = 0;
        int right = 0;
        if (node.left == null && node.right == null) {
            return 1;
        }
        if (node.left != null) {
            left = leafNodesCount(node.left);
        }
        if (node.right != null) {
            right = leafNodesCount(node.right);
        }

        return left + right;
    }

    public void height() {
        System.out.println("Height of the tree is " + height(root));
    }

    private int height(Node node) {
        int left = 0;
        int right = 0;
        if (node.left == null && node.right == null) {
            return 1;
        }
        if (node.left != null) {
            left = height(node.left);
        }
        if (node.right != null) {
            right = height(node.right);
        }
        return Math.max(left, right) + 1;
    }

    private int inorderSuccessor(Node node) {
        if (node.left != null) {
            return inorderSuccessor(node.left);
        } else {
            return node.item;
        }
    }

    public void delete(int key) {
        deleteNode(root, key);
    }

    private Node deleteNode(Node node, int key) {
        if (node.item == key) {
            if (node.left == null && node.right == null) {
                return null;
            } else if (node.left != null && node.right == null) {
                Node leftNode = node.left;
                node.left = null;
                return leftNode;
            } else if (node.left == null && node.right != null) {
                Node rightNode = node.right;
                node.right = null;
                return rightNode;
            } else {
                node.item = inorderSuccessor(node.right);
                node.right = deleteNode(node.right, node.item);
            }
        } else if (key < node.item && node.left != null) {
            node.left = deleteNode(node.left, key);
        } else if (key > node.item && node.right != null) {
            node.right = deleteNode(node.right, key);
        }

        return node;
    }
}

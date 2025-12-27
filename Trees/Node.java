package Trees;

public class Node {
    public int item;
    public Node left;
    public Node right;

    Node() {
        item = -1;
        left = null;
        right = null;
    }

    Node(int item) {
        this.item = item;
        left = null;
        right = null;
    }
}

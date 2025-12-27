package LinkedList;

public class ReverseList {
    Node head = null;
    public void add(Node node,int value){
        if(head == null){
            head = node;
        }
        while(node.next != null){
            node = node.next;
        }
        Node newNode = new Node(value);
        node.next = newNode;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.println(node.value);
            node = node.next;
        }
    }

    public void reverse(){
        Node p = head;
        Node q = p.next;
        Node curr = q.next;
        p.next = null;
        while(curr != null){
            q.next = p;
            p = q;
            q = curr;
            curr = curr.next;
        }
        q.next = p;
        head = q;
    }


    public static void main(String[] args) {
        ReverseList list = new ReverseList();
        
        Node node = new Node(1);
        list.add(node,2);
        list.add(node,3);
        list.add(node,4);

        // list.display();
        list.reverse();
        list.display();
    }
}

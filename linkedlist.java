public class linkedlist {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2=new Node(2);
        node1->next=node2;
        
        printLinkedlist(node1);
    }

    public static void printLinkedlist(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            // constructor
            this.data = data;
            this.next = null;
        }
    }
}


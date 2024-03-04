import java.util.Scanner;

public class linkedlisttraversal {
    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printLinkedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print("->"+curr.data);
            curr = curr.next;
        }
    }
    public void calculatinglength(Node head){
        int count =0;
         while(head!=null){
            count++;
            head=head.next;
         }
         System.out.println( "this is our length  "+count);
    }

    public static void main(String[] args) {
        linkedlisttraversal linkedListTraversal = new linkedlisttraversal();
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            Node newNode = new Node(x);//new node declaration

            if (head == null) {
                head = newNode;//agar head mein kux nahi hai to nya node banado 
                tail = newNode;//head or tail same hi honge yahaan
            } else {
                tail.next = newNode;//agar head but age ki value input karni hai to hum tail ko agle wale se point karnege
                tail = newNode;
            }
        }

        linkedListTraversal.printLinkedList(head);
        linkedListTraversal.calculatinglength(head);
    }
}

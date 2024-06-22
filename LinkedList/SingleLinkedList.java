
public class SingleLinkedList{

    Node head;
    static  class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[]){

        SingleLinkedList list = new SingleLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);

        list.printList(list.head);

        System.out.println("Insertion at beginning of list : ");
        list.insertNodeAtBeginning(10);
        list.printList(list.head);

        System.out.println("Insertion at End of list : ");
        list.insertNodeAtEnd(20, list.head);
        list.printList(list.head);

        System.out.println("Insertion at any position of list : ");
        list.insertNodeAtAnyPosition(30, 3,list.head);
        list.printList(list.head);

        System.out.println("Delete at beginning of list : ");
        list.head = list.deleteNodeAtBegin(list.head);
        list.printList(list.head);

        System.out.println("Delete at End of list : ");
        list.deleteNodeAtEnd(list.head);
        list.printList(list.head);

        System.out.println("Delete at any position of list : ");
        list.head = list.deleteNodeAtAnyPos(3,list.head);
        list.printList(list.head);

    }

    //    Print the SingleLinkedList
    public void printList(Node head){
        System.out.println("Single LinkedList : ");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //    Insertion of node at begining
    public void insertNodeAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //    Insertion of node at End
    public void insertNodeAtEnd(int data, Node head){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //    Insertion of node at any Position
    public void insertNodeAtAnyPosition(int data, int pos, Node head){
        Node newNode = new Node(data);
        if (pos <= 0) {
            System.out.println("Position should be greater than 0.");
            return;
        }

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;

        int i = 1;
        while(temp.next != null && i != pos-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Deletion of node at begining
    public Node deleteNodeAtBegin(Node head){

        if(head == null)
            return null;

        head = head.next;
       return head;
    }

    // Deletion of node at End
    public void deleteNodeAtEnd(Node head){
        if(head == null)
            return ;

        Node temp = head;
        while( temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
    }

    // Deletion of node at any position
    public Node deleteNodeAtAnyPos(int pos, Node head){
        if(head == null)
            return null;

        if(pos == 0){
            System.out.println("Deletion is not possible position start at 1.");
            return null;
        }

        if(pos == 1){
            return head.next;
        }


        Node temp = head;
        int i = 1;

        while(temp.next != null && i != pos-1){
            temp = temp.next;
            i++;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds.");
            return head;
        }

        temp.next = temp.next.next;


        return head;
    }

}

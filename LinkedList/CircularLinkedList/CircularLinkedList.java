public class CircularLinkedList {
    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Print Circular LinkedList
    public void printList(Node head) {

        if (head == null) {
            return;
        }

        System.out.println("Circular LinkedList : ");
        Node temp = head;

        System.out.print(temp.data + " ");
        temp = temp.next;

        while (temp != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Insertion of node at begining
    public void insertNodeAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        head = newNode;

    }

    // Insertion of node at End
    public void insertNodeAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // Insertion of node at any Position
    public void insertNodeAtAnyPosition(int data, int pos, Node head) {
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
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;

        int i = 1;
        while (temp.next != head && i != pos - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Deletion of node at begining
    public Node deleteNodeAtBeginning(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;

        return temp.next;
    }

    // Deletion of node at End
    public void deleteNodeAtEnd(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
    }

    // Deletion of node at any Position
    public void deleteNodeAtAnyPosition(int pos, Node head) {
        if (head == null) {
            return;
        }
        if (pos == 1) {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
            return;
        }
        Node temp = head;
        int i = 1;
        while (temp.next != head && i != pos - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    public static void main(String args[]) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        cll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = five;
        five.next = six;
        six.next = cll.head;

        cll.printList(cll.head);

        System.out.println("Insertion at beginning of list : ");
        cll.insertNodeAtBeginning(10);
        cll.printList(cll.head);

        System.out.println("Insertion at End of list : ");
        cll.insertNodeAtEnd(20);
        cll.printList(cll.head);

        System.out.println("Insertion at any position of list : ");
        cll.insertNodeAtAnyPosition(30, 2, cll.head);
        cll.printList(cll.head);

        System.out.println("Delete at beginning of list : ");
        cll.head = cll.deleteNodeAtBeginning(cll.head);
        cll.printList(cll.head);

        System.out.println("Delete at End of list : ");
        cll.deleteNodeAtEnd(cll.head);
        cll.printList(cll.head);

        System.out.println("Delete at any position of list : ");
        cll.deleteNodeAtAnyPosition(2, cll.head);
        cll.printList(cll.head);
    }

}
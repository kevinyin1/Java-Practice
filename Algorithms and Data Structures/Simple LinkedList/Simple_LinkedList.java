class Simple_LinkedList {

    Node head; // head of the LinkedList

    static class Node { // static b/c it allows the main class to access it

        int data;
        Node next;

        Node (int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Simple_LinkedList ll = new Simple_LinkedList();

        ll.head = new Node(1); //creates head node with value of 1
        Node second = new Node(2);
        Node third = new Node(3);

        ll.head.next = second; //links the head node to the second node
        second.next = third; //links the second node to the third node
        System.out.println(ll.head.next.next.data); //prints the value of data in the third node
    }

}

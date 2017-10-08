class Traversal_LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    //prints out the data of each node
    public void printList() {
        Node n = head;
        while(n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println("");
    }
    // insert a node into the linkedlist
    public void insert(int data) {
        Node insert_node = new Node(data);
        insert_node.next = head;
        head = insert_node;
    }
    // insert a node after a given node
    public void insertAfter(Node prev_node, int data) {
        Node new_node = new Node(data);
        if (prev_node == null) {
            System.out.println("Invalid node parameter");
            return;
        }
        Node n = head;
        while(n != null) {
            if (n == prev_node){
                new_node.next = prev_node.next;
                prev_node.next = new_node;
            }
            n = n.next;
        }
    }
    // insert a node at the end of a LinkedList
    public void insertEnd(int data) {
        Node new_node = new Node(data);
        new_node.next = null; // there should be no nodes after the last node
        if (head == null) { //checks if the LinkedList is empty
            head = new_node; // assigns the head of the empty LinkedList to a new node
            return;
        }
        Node n = head;
        while (n.next != null) {
            n = n.next; //assigns n with the last node in the LinkedList
        }
        n.next = new_node;
    }

    public static void main(String[] args) {
        Traversal_LinkedList tll = new Traversal_LinkedList();
        tll.head = new Node(1); //head node
        Node second = new Node(2); //second node
        Node third = new Node(3); //third node

        tll.head.next = second;
        second.next = third;

        tll.printList(); //expected output: 1 2 3
        tll.insert(4);
        tll.printList(); //expected output: 4 1 2 3
        tll.insertAfter(second, 10);
        tll.printList(); //expected output: 4 1 2 10 3
        tll.insertEnd(0);
        tll.printList(); //expected output: 4 1 2 10 3 0
        //test comment
    }
}

class Double_LinkedList {
    Node head;
    static class Node {
        int data;
        Node next, prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        head = one;
        head.next = two;
        head.prev = null;
        head.next.next = three;
        head.next.prev = head;
    }

}

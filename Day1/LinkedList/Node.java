package LinkedList;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

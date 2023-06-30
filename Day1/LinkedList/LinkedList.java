package LinkedList;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;

    }

    public boolean insert(int data) {
        Node newNode = new Node(data);

        if (newNode == null)
            return false;

        if (head == null) {
            this.head = newNode;
            return true;
        }
        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(newNode);

        return true;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public void display(Node head) {
        if (head == null)
            return;

        System.out.print(head.getData() + " ");
        display(head.getNext());
    }

    public Node getHead() {
        return head;
    }

    public void displayRev(Node head) {
        if (head == null)
            return;

        displayRev(head.getNext());
        System.out.print(head.getData() + " ");

    }
    

    public boolean insert (int data ,int pos){
       Node newNode = new Node(data);
       Node prev = head;
        if(pos == 1){
            newNode.setNext(head);
            head = newNode;
        }

       for (int i=1; i<pos-1;i++){
            prev = prev.getNext();
       }
       if (prev.getNext() != null){
          newNode.setNext(prev.getNext());
       }
       prev.setNext(newNode); 
        return true;
    }
}
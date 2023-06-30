package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
      //  l1.displayRev(l1.getHead());
       // l1.display(l1.getHead());
        l1.insert(100, 6);
        l1.display();
    }
}

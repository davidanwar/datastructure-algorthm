package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(7);
        linkedList.append(8);
        linkedList.reverse();
        linkedList.printList();
    }
}


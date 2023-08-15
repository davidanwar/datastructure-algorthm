package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(7);
        linkedList.append(8);
        System.out.println("Value Deleted");
        System.out.println(linkedList.removeLast().value);
        System.out.println("Print Remain Value");
        linkedList.printList();

    }
}


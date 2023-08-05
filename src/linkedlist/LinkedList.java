package linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        SingleLinkedList sLL = new SingleLinkedList();
        sLL.createSingleLinkedLIst(5);
        sLL.insertLinkedList(6, 0);
        sLL.insertLinkedList(7, 1);
        sLL.insertLinkedList(8, 1);
        sLL.insertLinkedList(9, 1);
        sLL.insertLinkedList(10, 2);
        sLL.traverseSingleLinkedList();
//        sLL.insertLinkedList(9, 1);
//        System.out.println(sLL.head.next.next.value);

    }
}


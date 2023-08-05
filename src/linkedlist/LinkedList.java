package linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        SingleLinkedList sLL = new SingleLinkedList();
        sLL.createSingleLinkedLIst(5);
        System.out.println(sLL.head.value);
    }
}


package linkedlist;

public class DoubleLinkedList {

    Node head;
    Node tail;
    int length;

    class Node {
        Node next;
        Node prev;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoubleLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
        }
    }
}

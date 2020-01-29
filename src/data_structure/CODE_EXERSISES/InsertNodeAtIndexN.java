package data_structure.CODE_EXERSISES;

import data_structure.ad_linked_list.SinglyLinkedList;

public class InsertNodeAtIndexN {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.addFirst(12);
        linkedList.addLast(13);
        linkedList.addLast(12);
        linkedList.addLast(1);
        linkedList.addLast(14);

        SinglyLinkedList.Node<Integer> head = linkedList.getHead();
        insertNodeAtIndexN(head, 2, 145);
        insertNodeAtIndexN(head, 10, 190);
        insertNodeAtIndexN(head, -1, 213);
        insertNodeAtIndexN(head, 5, 213);
        printList(head);
    }


    private static void insertNodeAtIndexN(SinglyLinkedList.Node<Integer> head, int index, int e) {
        int count = 0;
        SinglyLinkedList.Node<Integer> current = head;
        while (current != null) {
            if (count == index - 1) {
                SinglyLinkedList.Node<Integer> newNode = new SinglyLinkedList.Node<>(e, current.getNext());
                current.setNext(newNode);
                return;
            }
            count++;
            current = current.getNext();
        }
        assert(false);
        System.out.println("Given value " + e + " at index " + index + " is out of bounds");
    }

    private static void printList(SinglyLinkedList.Node<Integer>  head) {
        while (head != null) {
            System.out.print(head.getElement() + " ");
            head = head.getNext();
        }
    }
}

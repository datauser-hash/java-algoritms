package data_structure.CODE_EXERSISES;

import data_structure.ad_linked_list.SinglyLinkedList;

public class RecursiveReversalSLL {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.addFirst(12);
        linkedList.addLast(13);
        linkedList.addLast(11);
        linkedList.addLast(1);
        linkedList.addLast(14);

        SinglyLinkedList.Node<Integer> head = linkedList.getHead();
        head = recursiveReverse(head);
        printList(head);
    }


    private static SinglyLinkedList.Node<Integer> recursiveReverse(SinglyLinkedList.Node<Integer> head) {
        if (head == null) {
            return null;
        }
        if (head.getNext() == null) {
            return head;
        }
        SinglyLinkedList.Node<Integer> newHead = recursiveReverse(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;
    }
    private static void printList(SinglyLinkedList.Node<Integer>  head) {
        while (head != null) {
            System.out.print(head.getElement() + " ");
            head = head.getNext();
        }
    }
}

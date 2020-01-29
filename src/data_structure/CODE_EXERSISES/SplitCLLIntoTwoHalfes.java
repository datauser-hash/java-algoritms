package data_structure.CODE_EXERSISES;

import data_structure.ad_linked_list.CircularlyLinkedList;

public class SplitCLLIntoTwoHalfes {
    private static CircularlyLinkedList.Node<Integer> head, head1, head2;

    public static void main(String[] args) {
        CircularlyLinkedList<Integer> linkedList = new CircularlyLinkedList<>();
        linkedList.addFirst(12);
        linkedList.addLast(13);
        linkedList.addLast(11);
        linkedList.addLast(1);
        linkedList.addLast(14);

        head = linkedList.getTail().getNext();
        splitList();

        printList(head);
        printList(head1);
        printList(head2);
    }

    private static void splitList() {
        CircularlyLinkedList.Node<Integer> slowPointer = head;
        CircularlyLinkedList.Node<Integer> fastPointer = head;

        if (head == null) {
            return;
        }
        /* If there are odd nodes in the circular list then
         fast_ptr->next becomes head and for even nodes
         fast_ptr->next->next becomes head */
        while (fastPointer.getNext() != head && fastPointer.getNext().getNext() != head) {
            fastPointer = fastPointer.getNext().getNext();
            slowPointer = slowPointer.getNext();
        }

        /* If there are even elements in list then move fast_ptr */
        if (fastPointer.getNext().getNext() == head) {
            fastPointer = fastPointer.getNext();
        }

        /* Set the head pointer of first half */
        head1 = head;

        /* Set the head pointer of second half */
        if (head.getNext() != head) {
            head2 = slowPointer.getNext();
        }

        /* Make second half circular */
        fastPointer.setNext(slowPointer.getNext());

        /* Make first half circular */
        slowPointer.setNext(head);
    }


    private static void printList(CircularlyLinkedList.Node<Integer>  head) {
        CircularlyLinkedList.Node<Integer> current = head;
        while (current.getNext() != head) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println(current.getElement());
    }
}

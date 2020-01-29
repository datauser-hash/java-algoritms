package data_structure.CODE_EXERSISES;

import data_structure.ad_linked_list.SinglyLinkedList;

public class SplitSllDiffDirection {
    private static SinglyLinkedList.Node<Integer> head, head1, head2;
    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.addFirst(12);
        linkedList.addLast(13);
        linkedList.addLast(11);
        linkedList.addLast(1);
        linkedList.addLast(14);

        head = linkedList.getHead();
        split();

        printList(head1);
        System.out.println();
        printList(head2);
    }


    private static void split() {
        if (head == null || head.getNext() == null) {
            return;
        }
        SinglyLinkedList.Node<Integer> fast_pointer = head;
        SinglyLinkedList.Node<Integer> slow_pointer = head;
        head1 = head;
        while (fast_pointer.getNext() != null && fast_pointer.getNext().getNext() != null) {
            fast_pointer = fast_pointer.getNext().getNext();
            slow_pointer = slow_pointer.getNext();
        }
        SinglyLinkedList.Node<Integer> current = head1;
        while (true){
            if (current == slow_pointer) {
                head2 = current.getNext();
                current.setNext(null);
                break;
            }
            current = current.getNext();

        }

        SinglyLinkedList.Node<Integer> prev = null;
        SinglyLinkedList.Node<Integer> curr = head1;
        SinglyLinkedList.Node<Integer> next = null;
        while (curr != null) {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }

        head1 = prev;

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

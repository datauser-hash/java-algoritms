package data_structure.CODE_EXERSISES;


import data_structure.ad_linked_list.SinglyLinkedList;

/**
 * Given heade node check if it
 */
public class CheckeLinkedLIstCircularOrSingly {


    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.addFirst(12);
        linkedList.addLast(13);
        linkedList.addLast(12);
        linkedList.addLast(1);
        linkedList.addLast(14);

        SinglyLinkedList.Node<Integer> head = linkedList.getHead();
        SinglyLinkedList.Node<Integer> tail = linkedList.getTail();
//        tail.setNext(head);

        System.out.println(isCircular(head));
    }


    private static boolean isCircular(SinglyLinkedList.Node<Integer> head) {
        if (head == null) {
            return true;
        }
        SinglyLinkedList.Node<Integer>  next = head.getNext();
        while (next != null && next != head) {
            next = next.getNext();
        }

        return next == head;
    }
}

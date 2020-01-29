package data_structure.CODE_EXERSISES;

import data_structure.ad_linked_list.SinglyLinkedList;

public class GetNthValueOfLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.addFirst(12);
        linkedList.addLast(13);
        linkedList.addLast(12);
        linkedList.addLast(1);
        linkedList.addLast(14);

        SinglyLinkedList.Node<Integer> head = linkedList.getHead();

        System.out.println(getNthElement(head, 3));
        System.out.println(getNthElement(head, 2));
        System.out.println(getNthElement(head, 1));
    }


    private static int getNthElement(SinglyLinkedList.Node<Integer> head, int index) {
        int count = 0;
        while (head != null) {
            if (count == index) {
                return head.getElement();
            }
            count++;
            head = head.getNext();
        }

        assert(false);
        return 0;
    }
}

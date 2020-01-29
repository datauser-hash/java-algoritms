package data_structure.CODE_EXERSISES;

import data_structure.af_queus.CircularQueue;
import data_structure.af_queus.LinkedCircularQueue;

public class Josephus {

    public static void main(String[] args) {
        String[ ] a1 = {"Alice", "Bob", "Cindy", "Doug", "Ed", "Fred"};
        String[ ] a2 = {"Gene", "Hope", "Irene", "Jack", "Kim", "Lance"};
        String[ ] a3 = {"Mike", "Roberto"};

        System.out.println("First winner is " + josephus(buildQueue(a1), 3));
        System.out.println("Second winner is " + josephus(buildQueue(a2), 10));
        System.out.println("Third winner is " + josephus(buildQueue(a3), 7));
    }

    private static <E> E josephus(CircularQueue<E> queue, int k) {
        if (queue.isEmpty()) {
            return null;
        }
        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.rotate();
            }
            E e = queue.dequeue();
            System.out.println("    " + e + " is out");
        }
        return queue.dequeue();
    }

    private static <E> CircularQueue<E> buildQueue(E[] a) {
        CircularQueue<E> queue = new LinkedCircularQueue<>();

        for (E e : a) {
            queue.enqueue(e);
        }
        return queue;
    }


}

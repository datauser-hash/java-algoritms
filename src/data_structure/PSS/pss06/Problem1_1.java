package data_structure.PSS.pss06;
import data_structure.af_queus.LinkedQueue;
import data_structure.af_queus.Queue;


public class Problem1_1 {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedQueue<>();
        integerQueue.enqueue(78);
        integerQueue.enqueue(7);
        integerQueue.enqueue(12);
        integerQueue.enqueue(0);
        integerQueue.enqueue(5);
        integerQueue.enqueue(99);

        Integer maxNumber = max(integerQueue);
        System.out.println(maxNumber);

    }


    private static Integer max(Queue<Integer> queue) {
        int size = queue.size();

        Integer result = queue.first();         // Current maximum
        while (size-- > 0) {
            Integer current = queue.dequeue();  // Get and remove head element
            if (current > result) {             // Compare with current maximum
                result = current;
            queue.enqueue(current);             // Put back the element to tail
            }
        }
        return result;
    }
}

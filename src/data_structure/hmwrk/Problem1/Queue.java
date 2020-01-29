package data_structure.hmwrk.Problem1;

public interface Queue<E> {
    int size();


    boolean isEmpty();


    void enqueue(E element);


    E dequeue();


    E first();
}

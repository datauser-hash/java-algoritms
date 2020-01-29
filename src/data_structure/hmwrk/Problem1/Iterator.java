package data_structure.hmwrk.Problem1;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public interface Iterator<E> extends java.util.Iterator<E> {


    E next() throws NoSuchElementException;


    boolean hasNext();


    void remove() throws IllegalStateException;


    @Override
    default void forEachRemaining(Consumer<? super E> action) {

    }
}

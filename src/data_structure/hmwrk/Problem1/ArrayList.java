package data_structure.hmwrk.Problem1;
import java.util.NoSuchElementException;


public class ArrayList<E> implements List<E> {
    private static final int CAPACITY = 16;
    E[] data;
    private int size = 0;

    public ArrayList() {
        this(CAPACITY);
    }


    public ArrayList(int capacity) {
        data = (E[]) new Object[capacity];
    }


    private class ArrayIterator implements Iterator<E> {
        private int j = 0;
        private boolean removable = false; // can remove be called at this time?

        public boolean hasNext( ) {
            return j < size;
        }


        public E next( ) throws NoSuchElementException {
            if (j == size) throw new NoSuchElementException("No next element");
            removable = true;
            return data[j++];
        }


        public void remove( ) throws IllegalStateException {
            if (!removable) throw new IllegalStateException("nothing to remove");
            ArrayList.this.remove(j-1); // that was the last one returned
            j--;
            removable = false;
        }
    }


    public Iterator<E> iterator( ) {
        return  new ArrayIterator( );

    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public E get(int i) throws IndexOutOfBoundsException{
        checkIndex(i,size);
        return data[i];
    }


    public E set(int i, E element) throws IndexOutOfBoundsException{
        checkIndex(i, size);
        E tmp = data[i];
        data[i] = element;
        return tmp;
    }


    public void add(int i, E element) throws IndexOutOfBoundsException{
        checkIndex(i,size);
        if (size == data.length) { resize(2 * data.length);}
        for (int k = size - 1; k >= i; k--){
            data[k + 1] = data[k];
        }
        data[i] = element;
        size++;
    }


    public void add(E element) throws IndexOutOfBoundsException{
        if (size == data.length) { resize(2 * data.length);}
        data[size++] = element;
    }


    public E remove(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        E temp = data[i];
        for (int k = i; k < size - 1; k++){
            data[k] = data[k + 1];
        }
        data[size - 1] = null;
        size--;
        return temp;
    }


    private void checkIndex(int i, int n) throws IndexOutOfBoundsException{
        if (i < 0 || i >= n){
            throw new IndexOutOfBoundsException("Illegal index");
        }
    }


    protected void resize(int capacity) {
        E[] tmp = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++){
            tmp[i] = data[i];
        }
        data = tmp;
    }
}

package data_structure.hmwrk.Problem1;


public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {
    public Position<E> sibling(Position<E> p) throws IllegalArgumentException {
        Position<E> parent = parent(p);
        if (parent == null) {
            return null;
        }
        if (p == left(parent)) {
            return right(parent);
        }
        else {
            return left(parent);
        }
    }

    public int numChildren(Position<E> p) throws IllegalArgumentException {
        int count = 0;
        if (left(p) != null) {
            count++;
        }
        if (right(p) != null) {
            count++;
        }
        return count;
    }

    public Iterable<Position<E>> children(Position<E> p) {
        List<Position<E>> snapshot = new ArrayList<>(2); // max capacity of 2
        if (left(p) != null)
            snapshot.add(left(p));
        if (right(p) != null)
            snapshot.add(right(p));
        return snapshot;
    }

    private void InorderSubtree(Position<E> p, List<Position<E>> snapshot){
        if (left(p) != null){
            InorderSubtree(left(p),snapshot);
        }
        snapshot.add(p);
        if (right(p) != null){
            InorderSubtree(right(p),snapshot);
        }
    }

    public Iterable<Position<E>> inorder(){
        List<Position<E>> snapshot = new ArrayList<Position<E>>();
        if (!isEmpty()) { InorderSubtree(root(),snapshot);}
        return snapshot;
    }

    public Position<E> findMin(){
        if (isEmpty()) { return null; }
        Position<E> min = root();
        for (Iterator<Position<E>> walk = (Iterator<Position<E>>) positions().iterator(); walk.hasNext();){
            Position<E> current = walk.next();
            if ((int)min.getElement() > (int)current.getElement()) {
                min = current;
            }
        }
        return min;
    }


    public Iterable<Position<E>> preOrderNext(Position<E> p) {
        List<Position<E>> list = new ArrayList<Position<E>>();
        if (p == null ) {
            preOrderNextSubtree(p,list);
        }
        return list;
    }
    public void preOrderNextSubtree(Position<E> p, List<Position<E>> list){
        list.add(p);
        for (Iterator<Position<E>> it = (Iterator<Position<E>>) children(p).iterator(); it.hasNext();){
            preOrderNextSubtree(it.next(),list);
        }
    }
}



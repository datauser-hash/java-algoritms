package data_structure.hmwrk.Problem1;


public abstract class AbstractTree<E> implements Tree<E> {


    public boolean isInternal(Position<E> p) {
        return numChildren(p) > 0;
    }

    public boolean isExternal(Position<E> p) {
        return numChildren(p) == 0;
    }

    public boolean isRoot(Position<E> p) {
        return p == root();
    }

    public boolean isEmpty() {
        return size() == 0; }


    public int depth(Position<E> p) {
        if (isRoot(p)){
            return 0;
        }else {
            return 1 + depth(parent(p));
        }
    }


    public int height(Position<E> p){
        int h = 0;
        for (Iterator<Position<E>> c = (Iterator<Position<E>>) children(p).iterator(); c.hasNext();){
            Position<E> d = c.next();
            h = Math.max(h,1 + height(d));
        }
        return h;
    }


    private void preOrderSubtree(Position<E> p, List<Position<E>> snapshot) {
        snapshot.add(p);
        for (Iterator<Position<E>> c = (Iterator<Position<E>>) children(p).iterator(); c.hasNext();){
            preOrderSubtree(c.next(),snapshot);
        }
    }

    public Iterable<Position<E>> preorder( ) {
        List<Position<E>> snapshot = new ArrayList<Position<E>>( );
        if (!isEmpty())
            preOrderSubtree(root(), snapshot);      // fill the snapshot recursively
        return snapshot;
    }

    private void postOrderSubtree(Position<E> p, List<Position<E>> snapshot){
        for (Iterator<Position<E>> c = (Iterator<Position<E>>) children(p).iterator(); c.hasNext();){
            postOrderSubtree(c.next(),snapshot);
        }
        snapshot.add(p);
    }
    public Iterable<Position<E>> postorder(){
        List<Position<E>> snapshot = new ArrayList<>();
        if (!isEmpty()) { postOrderSubtree(root(),snapshot);}
        return snapshot;
    }


    public Iterable<Position<E>> breadFirst(){
        List<Position<E>> snapshot = new ArrayList<>();
        if (!isEmpty()){
            Queue<Position<E>> q = new LinkedQueue<>();
            q.enqueue(root());
            while (!q.isEmpty()){
                Position<E> p = q.dequeue();
                snapshot.add(p);
                for (Iterator<Position<E>> it = (Iterator<Position<E>>) children(p).iterator(); it.hasNext();){
                    q.enqueue(it.next());
                }
            }
        }
        return snapshot;
    }
}

package data_structure.hmwrk.Problem1;

import java.util.Comparator;

public class BSTMap<K,V> extends AbstractSortedMap<K,V> {

    private LinkedBinaryTree<Entry<K,V>> binaryTree = new LinkedBinaryTree<>();


    public BSTMap() {
        super();
        this.binaryTree.addRoot(null);
    }


    public BSTMap(Comparator<K> comp){
        super(comp);
        this.binaryTree.addRoot(null);
    }


    public int size() {
        return ((this.binaryTree.size() - 1 ) / 2);
    }


    private void expandExternal(Position<Entry<K,V>> position, Entry<K,V> entry) {
        this.binaryTree.set(position, entry);
        this.binaryTree.addLeft(position,null);
        this.binaryTree.addRight(position,null);
    }


    private Position<Entry<K,V>> treeSearch(Position<Entry<K,V>> position, K key){
        if (isExternal(position)) {
            return position;
        }
        int comp = compare(key, position.getElement());
        if (comp == 0) { return position; }
        else if (comp < 0) { return treeSearch(left(position),key); }
        else { return treeSearch(right(position),key); }
    }


    public V get(K key) throws IllegalArgumentException {
        checkKey(key);
        Position<Entry<K,V>> position = treeSearch(root(),key);
        if (isExternal(position)) { return null; }
        return position.getElement().getValue();
    }


    public V put(K key, V value) throws IllegalArgumentException {
        checkKey(key);
        Entry<K,V> newEntry = new MapEntry<>(key,value);
        Position<Entry<K,V>> position = treeSearch(root(),key);

        if (isExternal(position)) {
            expandExternal(position,newEntry);
            return null;
        }else {
            V old = position.getElement().getValue();
            set(position,newEntry);
            return old;
        }
    }


    public V remove(K key) throws IllegalArgumentException {
        checkKey(key);
        Position<Entry<K,V>> entryPosition = treeSearch(root(), key);

        if (isExternal(entryPosition)) {
            return null;
        }
        else {
            V old = entryPosition.getElement().getValue();
            if (isInternal(left(entryPosition)) && isExternal(right(entryPosition))) {
                Position<Entry<K,V>> replacement = maxPosition(left(entryPosition));
                set(entryPosition,replacement.getElement());
                entryPosition = replacement;
            }
            Position<Entry<K,V>> leaf = isExternal(left(entryPosition)) ? left(entryPosition) : right(entryPosition);
            Position<Entry<K,V>> sibling = sibling(leaf);
            remove(leaf);
            remove(entryPosition);
            return old;
        }
    }


    public Entry<K,V> firstEntry() {
        if (isEmpty()) {
            return null;
        }

        return minPosition(root()).getElement();
    }


    public Entry<K,V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return maxPosition(root()).getElement();
    }

    public Entry<K,V> ceilingEntry(K key) throws IllegalArgumentException {
        checkKey(key);
        Position<Entry<K,V>> p = treeSearch(root(),key);
        if (isInternal(p)){ return p.getElement(); }
        while (!isRoot(p)) {
            if (p == left(parent(p))) {
                return parent(p).getElement();
            }else {
                p = parent(p);
            }
        }
        return null;
    }


    public Entry<K,V> floorEntry(K key) throws IllegalArgumentException {
        checkKey(key);
        Position<Entry<K,V>> position = treeSearch(root(),key);

        if (isInternal(position)) {
            return position.getElement();
        }

        while (!isRoot(position)) {
            if (position == right(parent(position))){
                return parent(position).getElement();
            } else {
                position = parent(position);
            }
        }
        return null;
    }


    public Entry<K,V> lowerEntry(K key) throws IllegalArgumentException {
        checkKey(key);
        Position<Entry<K,V>> position = treeSearch(root(), key);
        if (isInternal(position) && isInternal(left(position))) {
            return maxPosition(left(position)).getElement();
        }

        while (!isRoot(position)){
            if (position == right(parent(position))) {
                return parent(position).getElement();
            }else {
                position = parent(position);
            }
        }
        return null;
    }


    public Entry<K,V> higherEntry(K key) throws IllegalArgumentException {
        checkKey(key);
        Position<Entry<K,V>> p = treeSearch(root(),key);
        if (isInternal(p) && isInternal(right(p))) {
            return minPosition(right(p)).getElement();
        }
        while (!isRoot(p)){
            if (p == left(parent(p))) {
                return parent(p).getElement();
            }else {
                p = parent(p);
            }
        }
        return null;
    }


    public Iterable<Entry<K,V>> entrySet() {
        ArrayList<Entry<K,V>> buffer = new ArrayList<Entry<K,V>>(size());

        for (Iterator<Position<Entry<K,V>>> position = (Iterator<Position<Entry<K, V>>>) this.binaryTree.inorder().iterator(); position.hasNext();){
            Position<Entry<K,V>> it = position.next();
            if (isInternal(it)) {
                buffer.add(it.getElement());
            }
        }
        return buffer;
    }


    protected Position<Entry<K,V>> root() {
        return this.binaryTree.root();
    }


    protected Position<Entry<K,V>> parent(Position<Entry<K,V>> p){
        return this.binaryTree.parent(p);
    }

    protected Position<Entry<K,V>> left(Position<Entry<K,V>> p){
        return this.binaryTree.left(p);
    }

    protected Position<Entry<K,V>> right(Position<Entry<K,V>> p){
        return this.binaryTree.right(p);
    }

    protected Position<Entry<K,V>> sibling(Position<Entry<K,V>> p){
        return this.binaryTree.sibling(p);
    }

    protected boolean isRoot(Position<Entry<K,V>> p){
        return this.binaryTree.isRoot(p);
    }

    protected boolean isExternal(Position<Entry<K,V>> p){
        return this.binaryTree.isExternal(p);
    }

    protected boolean isInternal(Position<Entry<K,V>> p){
        return this.binaryTree.isInternal(p);
    }

    protected void set(Position<Entry<K,V>> p, Entry<K,V> e){
        this.binaryTree.set(p,e);
    }

    protected Entry<K,V> remove(Position<Entry<K,V>> p){
        return this.binaryTree.remove(p);
    }

    protected Position<Entry<K,V>> minPosition(Position<Entry<K,V>> p) {
        Position<Entry<K,V>> c = p;
        while (isInternal(c)) {
            c = left(c);
        }
        return parent(c);
    }

    protected Position<Entry<K,V>> maxPosition(Position<Entry<K,V>> p) {
        Position<Entry<K,V>> c = p;
        while (isInternal(c)) {
            c = right(c);
        }
        return parent(c);
    }

    private void creatSubMap(K start, K end, Position<Entry<K,V>> entryPosition, ArrayList<Entry<K,V>> arrayList){
        if (isInternal(entryPosition)) {
            if (compare(entryPosition.getElement(), start) < 0) {
                creatSubMap(start, end, right(entryPosition), arrayList);
            }else {
                creatSubMap(start, end, left(entryPosition), arrayList);
                if (compare(entryPosition.getElement(), end) < 0) {
                    arrayList.add(entryPosition.getElement());
                    creatSubMap(start, end, right(entryPosition), arrayList);
                }
            }
        }
    }


    public Iterable<Entry<K,V>> subMap(K fromKey, K toKey) throws IllegalArgumentException {
        ArrayList<Entry<K,V>> arrayList = new ArrayList<>(size());

        if (compare(fromKey, toKey) < 0) {
            creatSubMap(fromKey, toKey, root(), arrayList);
        }
        return arrayList;
    }

}

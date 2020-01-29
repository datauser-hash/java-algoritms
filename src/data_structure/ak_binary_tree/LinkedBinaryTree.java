package data_structure.ak_binary_tree;


import data_structure.aj_trees.Position;

import java.util.Iterator;

public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {

    protected static class Node<E> implements Position<E> {
        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;

        public Node(E element, Node<E> parent, Node<E> left, Node<E> right){
            this.element = element;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        public E getElement() { return element; }
        public Node<E> getParent() { return parent; }
        public Node<E> getLeft() { return left; }
        public Node<E> getRight() { return right; }

        public void setElement(E e) { this.element = element; }
        public void setParent(Node<E> parent) { this.parent = parent; }
        public void setLeft(Node<E> left) { this.left = left; }
        public void setRight(Node<E> right) { this.right = right; }

    }

    // util
    private Node<E> createNode(E element, Node<E> parent, Node<E> left, Node<E> right) {
        return new Node<>(element,parent,left,right);
    }
    protected Node<E> validate(Position<E> p) throws IllegalArgumentException{
        if (!(p instanceof Node)) { throw new IllegalArgumentException("Wrong Node");}
        Node<E> node = (Node<E>) p;
        if (node.getParent() == node) { throw new IllegalArgumentException("p is not in the tree anymore");}
        return node;
    }

    protected Node<E> root = null;
    private int size = 0;

    public LinkedBinaryTree() {}

    public int size() { return size; }

    public Position<E> root() {
        return root;
    }
    public Position<E> parent(Position<E> p) throws IllegalArgumentException{
        Node<E> node = validate(p);
        return node.getParent();
    }
    public Position<E> left(Position<E> p) throws IllegalArgumentException{
        Node<E> node = validate(p);
        return node.getLeft();
    }
    public Position<E> right(Position<E> p) throws IllegalArgumentException{
        Node<E> node = validate(p);
        return node.getRight();
    }
    public Position<E> addRoot(E e) throws IllegalStateException{
        if (!isEmpty()) { throw new IllegalStateException("Tree is not empty:"); }
        root = createNode(e,null,null,null);
        size = 1;
        return root;
    }
    public Position<E> addLeft(Position<E> p, E e) throws IllegalStateException{
        Node<E> parent = validate(p);
        if (parent.getLeft() != null) { throw new IllegalStateException("p already has a left child");}
        Node<E> child = new Node<>(e,parent,null,null);
        parent.setLeft(child);
        size++;
        return child;
    }
    public Position<E> addRight(Position<E> p,E e) throws IllegalStateException{
        Node<E> parent = validate(p);
        if (parent.getRight() != null ) { throw new IllegalStateException("p already has a right child"); }
        Node<E> child = createNode(e, parent,null,null);
        parent.setRight(child);
        size++;
        return child;
    }
    public E set(Position<E> p, E e) throws IllegalStateException{
        Node<E> node = validate(p);
        E answer = node.getElement();
        node.setElement(e);
        return answer;
    }
    public E remove(Position<E> p) throws IllegalStateException{
        Node<E> node = validate(p);
        if (numChildren(p) == 2) { throw new IllegalStateException("p has two children"); }
        Node<E> child = (node.getLeft() != null ? node.getLeft() : node.getRight());
        if (child != null) {
            child.setParent(node.getParent());
        }
        if (node == root()){
            root = child;
        }else {
            Node<E> parent = node.getParent();
            if (node == parent.getLeft()){
                parent.setLeft(child);
            }else {
                parent.setRight(child);
            }
        }
        size--;
        E answer = node.getElement();
        node.setElement(null);
        node.setRight(null);
        node.setLeft(null);
        node.setParent(node);
        return answer;
    }
    public void attach(Position<E> p, LinkedBinaryTree<E> T1, LinkedBinaryTree<E> T2)throws IllegalStateException{
        Node<E> node = validate(p);
        if (isInternal(p)) { throw new IllegalStateException("p must be a leaf"); }
        size += T1.size() + T2.size();
        if (!T1.isEmpty()){
            T1.root.setParent(node);
            node.setLeft(T1.root);
            T1.root = null;
            T1.size = 0;
        }
        if (!T2.isEmpty()) {
            T2.root.setParent(node);
            node.setRight(T2.root);
            T2.root = null;
            T2.size = 0;
        }
    }

    private class ElementIterator implements Iterator<E> {
        Iterator<Position<E>> posIterator = positions().iterator();
        public boolean hasNext() { return posIterator.hasNext(); }
        public E next() { return posIterator.next().getElement(); }
        public void remove() { posIterator.remove(); }
    }
    public  Iterator<E> iterator() { return new ElementIterator(); }
    public Iterable<Position<E>> positions() { return inorder(); }

    //TODO
    public void Modify(){
        if (!isEmpty()){
            modifyHelper(root());
        }
    }
    public void modifyHelper(Position<E> p){
        for (Position<E> c : children(p)){
            modifyHelper(c);
        }
        if(right(p) != null) {
            Integer sum = inorderSum(right(p),(int)p.getElement());
            set(p,(E)sum);
        }

    }
    public int inorderSum(Position<E> p,int sum){
        if(left(p) != null){
            inorderSum(left(p), sum);
        }
        sum += (int)p.getElement();
        if (right(p) != null) {
            inorderSum(right(p),sum);
        }
        return sum;
    }
}

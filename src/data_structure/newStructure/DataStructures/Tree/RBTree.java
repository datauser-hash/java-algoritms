package data_structure.newStructure.DataStructures.Tree;

import data_structure.newStructure.DataStructures.DefaultComparator;

import java.util.Comparator;

public class RBTree<E> {

    // --------------------------- nested Node Class ---------------------------
    private static class Node<E> {
        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;
        private int colour; // 0 black 1 red;

        public Node(E e,Node<E> above,Node<E> leftChild,Node<E> rightChild){
            this.element = e;
            this.parent = above;
            this.left = leftChild;
            this.right = rightChild;
            this.colour = 0;
        }
        public E getElement() {
            return element;
        }

        public Node<E> getParent() {
            return parent;
        }

        public Node<E> getLeft() {
            return left;
        }

        public Node<E> getRight() {
            return right;
        }

        public int getColour() {
            return colour;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }

        public void setColour(int colour) {
            this.colour = colour;
        }
    }
    // ------------------------ end of the nested class ----------------------

    // instance variables
    private Node<E> nil = createNode(null,null,null,null);
    private int size = 0;
    private Comparator<E> comp;
    private Node<E> root = nil;

    // constructors
    public RBTree(){
        this.comp = new DefaultComparator<E>();
    }
    public RBTree(Comparator<E> comp){
        this.comp = comp;
    }

    public void insert(E element){
        Node<E> newNode = createNode(element,null,null,null);
        Node<E> y = nil;
        Node<E> x = root;
        while (x != nil){
            y = x;
            if (comp.compare(element,x.getElement()) < 0){
                x = x.getLeft();
            }else {
                x = x.getRight();
            }
        }
        newNode.parent = y;
        if (y == nil){
            root = newNode;
        }else if (comp.compare(element,y.getElement()) < 0){
            y.setLeft(newNode);
        }else {
            y.setRight(newNode);
        }
        newNode.setRight(nil);
        newNode.setLeft(nil);
        makeRed(newNode);
        InsertFixup(newNode);
    }

    private void InsertFixup(Node<E> p){
        while (p.getParent().getColour() == 1){
            if (p.getParent() == p.getParent().getParent().getLeft()){
                Node<E> y = p.getParent().getParent().getRight();
                if (y.getColour() == 1){
                    makeBlack(p.getParent());
                    makeBlack(y);
                    makeBlack(p.getParent().getParent());
                }else if (p == p.getParent().getRight()){
                    p = p.getParent();
                    leftRotate(p);
                    makeBlack(p.getParent());
                    makeRed(p.getParent().getParent());
                    rightRotate(p.getParent().getParent());
                }else {
                    
                }
            }
        }
        makeBlack(root);
    }

    private void leftRotate(Node<E> x){
        Node<E> y = x.getRight();
        x.setRight(y.getLeft());
        if (y.getLeft() != nil){
            y.getLeft().setParent(x);
        }
        y.setParent(x.getParent());
        if (x.getParent() == nil){
            root = y;
        }else if(x == x.getParent().getLeft()){
            x.getParent().setLeft(y);
        }else {
            x.getParent().setRight(y);
        }
        y.setLeft(x);
        x.setParent(y);
    }
    private void rightRotate(Node<E> y){
        Node<E> x = y.getRight();
        y.setLeft(x.getLeft());
        if (x.getRight() != nil){
            x.getRight().setParent(y);
        }
        x.setParent(y.getParent());
        if (y.getParent() == nil){
            root = x;
        }else if( y == y.getParent().getRight()){
            y.getParent().setRight(x);
        }else{
            y.getParent().setLeft(x);
        }
        x.setLeft(y);
        y.setParent(x);
    }

    // support

    // factory function for node creation
    protected Node<E> createNode(E e, Node<E> parent,Node<E> left,Node<E> right){
        return new Node<E>(e,parent,left,right);
    }

    public boolean isRed(Node<E> n) {
        return n.getColour() == 1;
    }
    public boolean isBlack(Node<E> n){
        return n.getColour() == 0;
    }
    public void makeRed(Node<E> n){
        n.setColour(1);
    }
    public void makeBlack(Node<E> n){
        n.setColour(0);
    }


}

package data_structure.ak_binary_tree;

import data_structure.aj_trees.AbstractTree;
import data_structure.aj_trees.Position;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {

    public Position<E> sibling(Position<E> p){
        if (parent(p) == null) { return null; }
        if (p == left(parent(p))) { return right(parent(p)); }
        else { return left(parent(p)); }
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
    public Iterable<Position<E>> children(Position<E> p){
        List<Position<E>> list = new ArrayList<>();
        if (left(p) != null) {
            list.add(p);
        }
        if (right(p) != null) {
            list.add(p);
        }
        return list;
    }
    public Iterable<Position<E>> inorder(){
        List<Position<E>> list = new ArrayList<>();
        if (!isEmpty()) {
            inorderHelper(root(), list);
        }
        return list;
    }
    private void inorderHelper(Position<E> p, List<Position<E>> list) {
        if (left(p) != null) {
            inorderHelper(left(p), list);
        }
        list.add(p);
        if (right(p) != null) {
            inorderHelper(right(p), list);
        }
    }
}





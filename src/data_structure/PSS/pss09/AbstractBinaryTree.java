package data_structure.PSS.pss09;//package DataStructures;
//import java.util.*;
//
///** An abstract base class providing some functionality of the BinaryTree interface.*/
//public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {
//    /** Returns the Position of p’s sibling (or null if no sibling exists). */
//    public Position<E> sibling(Position<E> p) {
//        Position<E> parent = parent(p);
//        if (parent == null)
//            return null;
//        if (p == left(parent))
//            return right(parent);
//        else
//            return left(parent);
//    }
//    /** Returns the number of children of Position p. */
//    public int numChildren(Position<E> p) {
//        int count=0;
//        if (left(p) != null)
//            count++;
//        if (right(p) != null)
//            count++;
//        return count;
//    }
//    /** Returns an iterable collection of the Positions representing p’s children. */
//    public Iterable<Position<E>> children(Position<E> p) {
//        List<Position<E>> snapshot = new ArrayList<>(2);
//        if (left(p) != null)
//            snapshot.add(left(p));
//        if (right(p) != null)
//            snapshot.add(right(p));
//        return snapshot;
//    }
//
//    public boolean areIsomorphic(Position p1, Position p2) {
//    	//if(p1==null && p2==null), but there will be no case that p1 or p2 are null
//    	if(p1==null) {
//    		if(p2==null)
//    			return true;
//    		else
//    			return false;
//    	}
//    	if(p2==null) {
//    		if(p1==null)
//    			return true;
//    		else
//    			return false;
//    	}
//
//
//    	return areIsomorphic(left(p1),left(p2)) && areIsomorphic(right(p1),right(p2));
//    }
//
//    public int numberOfNodes(Position<E> p) {
//    	if(p==null)
//    		return 0;
//    	return numberOfNodes(left(p))+1+numberOfNodes(right(p));
//    }
//
//    public boolean areEqual(Position p1, Position p2) {
//    	if(p1==null) {
//    		if(p2==null)
//    			return true;
//    		else
//    			return false;
//    	}
//    	if(p2==null) {
//    		if(p1==null)
//    			return true;
//    		else
//    			return false;
//    	}
//
//    	if(p1.getElement().equals(p2.getElement())
//    			&& areEqual(left(p1), left(p2)) && areEqual(right(p1),right(p2))) {
//    		return true;
//    	}
//
//    	return false;
//    }
//
//    public boolean containsSubtreeHelper(Position<E> p1, Position<E> p2) {
//    		if(p1==null)
//    			return false;
//
//    		if(areEqual(p1,p2))
//    			return true;
//
//    		return containsSubtreeHelper(left(p1),p2) || containsSubtreeHelper(right(p1),p2);
//    }
//    public boolean containsSubtree(Position<E> p) {
//    	return containsSubtreeHelper(root(),p);
//    }
//
//    public Position<E> findRoman(Position<E> p){
//    	if(p==null)
//    		return null;
//    	if(Math.abs(numberOfNodes(left(p))-numberOfNodes(right(p)))<=5)
//			return p;
//
//    	Position<E> leftRoman = findRoman(left(p));
//    	if(leftRoman!=null)
//    		return leftRoman;
//
//    	Position<E> rightRoman = findRoman(right(p));
//    	return rightRoman;
//    }
//}

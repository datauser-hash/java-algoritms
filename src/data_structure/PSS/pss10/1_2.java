package data_structure.PSS.pss10;//package DataStructures;
//import java.util.*;
//
///** An abstract base class providing some functionality of the BinaryTree interface.*/
//public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {
//
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
//
//    /** Returns the number of children of Position p. */
//    public int numChildren(Position<E> p) {
//        int count=0;
//        if (left(p) != null)
//            count++;
//        if (right(p) != null)
//            count++;
//        return count;
//    }
//
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
//	/** Checks if given position 'p' is the last child of it's parent position. */
//	public boolean isLastChild( Position<E> p ) {
//		Position<E> par = parent(p);
//		if ( par == null )
//			return true; // Root is always last child
//		if ( left(par) == p ) {
//			// This was left child
//			if ( right(par) == null )
//				return true;
//			else
//				return false;
//		}
//		else {
//			// This was right child
//			return true;
//		}
//	}
//
//	/** Returns the next position in preorder traversal. */
//	public Position<E> preorderNext( Position<E> p ) {
//		// Check if 'p' has child nodes
//		if ( left(p) != null )
//			return left(p);
//		if ( right(p) != null )
//			return right(p);
//		// Move up, as long as it is necessary
//		while ( p != null && isLastChild(p) )
//			p = parent(p);
//		if ( p == null )
//			return null; // This was already the last element
//		return sibling(p);
//	}
//}

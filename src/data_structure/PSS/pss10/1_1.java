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
//	/**
//	 * Returns minimal element of the entire tree.
//	 */
//	public Position<E> treeMinimum() {
//		E minimum;
//		boolean isFirst = true;
//		// Iterate over all elements of the tree, in any order.
//		Iterator<E> it = iterator();
//		while ( it.hasNext() ) {
//			E elem = it.next();
//			if ( isFirst ) {
//				// On first element, we just assign
//				minimum = elem;
//				isFirst = false;
//			}
//			else {
//				// On next elements, we compare
//				if ( elem < minimum )
//					minimum = elem;
//			}
//		}
//		return minimum;
//	}
//
//}

package data_structure.PSS.pss10;//package DataStructures;
//
//public abstract class AbstractTree<E> implements Tree<E> {
//    public boolean isInternal(Position<E> p) {
//        return numChildren(p) > 0;
//    }
//
//    public boolean isExternal(Position<E> p) {
//        return numChildren(p) == 0;
//    }
//
//    public boolean isRoot(Position<E> p) {
//        return p == root();
//    }
//
//    public boolean isEmpty() {
//        return size() == 0;
//    }
//
//    public int height(Position<E> p) {
//        int h = 0;
//        for (Position<E> c : children(p))
//            h = Math.max(h, 1 + height(c));
//        return h;
//    }
//
//    public int depth(Position<E> p) {
//        if (isRoot(p)) return 0;
//        else
//            return 1 + depth(parent(p));
//
//    }
//
//	/**
//	 * Returns absolute difference between preorder traversal index
//	 *   and postorder traversal index.
//	 */
//	public int difference( Position<E> p ) {
//		int preIndex = ...;
//		int postIndex = ...;
//		// Return absolute difference
//	}
//}

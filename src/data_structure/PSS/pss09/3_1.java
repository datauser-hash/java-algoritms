package data_structure.PSS.pss09;//
//public static void removeSubtree( TreeNode<E> node ) {
//	TreeNode<E> parent = node.getParent();
//	if ( parent == null ) {
//		// This is root node, do nothing
//	}
//	else {
//		if ( parent.getLeft() == node ) {
//			// This is left subtree
//			parent.setLeft( null );
//			node.setParent( null );
//
//		}
//		else {
//			// This is right subtree
//			parent.setRight( null );
//			node.setParent( null );
//		}
//		// Decrease sizes of subtrees
//		int nodeSize = node.getSize();
//		TreeNode<E> p = parent;
//		while ( p != null ) {
//			p.setSize( p.getSize() - nodeSize );
//			p = p.getParent();
//		}
//	}
//}

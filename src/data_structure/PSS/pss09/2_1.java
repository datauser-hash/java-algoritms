package data_structure.PSS.pss09;//
//public static int subtreeSize( BinaryTree<E> t, Position<E> p ) {
//	int result = 0;
//	// Check left subtree
//	Position<E> leftP = t.left( p );
//	if ( leftP != null )
//		result += subtreeSize( t, leftP );
//	// Check right subtree
//	Position<E> rightP = t.right( p );
//	if ( rightP != null )
//		result += subtreeSize( t, rightP );
//	// Don't forget also about this node
//	++result;
//	return result;
//}
//
//public static boolean isRoman( BinaryTree<E> t, Position<E> p ) {
//	// Obtain sizes of the subtrees
//	int leftSize = subtreeSize( t, t.left(p) );
//	int rightSize = subtreeSize( t, t.right(p) );
//	// COmpare them
//	return Math.abs( leftSize - rightSize ) <= 5;
//}
//
//public static int findRomans( BinaryTree<E> t ) {
//	int result = 0;
//	// Iterate over all nodes
//	Iterator<Position<E>> ps = t.positions().iterator();
//	for ( Position<E> p : t.positions() ) {
//	//while ( ps.hasNext() ) {
//		Position<E> p = ps.next();
//		// Check if 'p' is Roman
//		if ( isRoman( t, p ) )
//			++result;
//	}
//	return result;
//}

package data_structure.PSS.pss09;//
//public static boolean areIsomorphic( Tree<E> T1, Position<E> p1, Tree<E> T2, Position<E> p2 ) {
//	// Step 2
//	if ( T1.numChildren( p1 ) == 0 && T2.numChildren( p2 ) == 0 )
//		return true;
//	// Step 3
//	if ( T1.numChildren( p1 ) != T2.numChildren( p2 ) )
//		return false;
//	// Check pairs of subtrees
//	Iterator<Position<E>> ch1 = T1.children( p1 ).iterator();
//	Iterator<Position<E>> ch2 = T2.children( p2 ).iterator();
//	while ( ch1.hasNext() ) {
//		Position<E> chp1 = ch1.next();
//		Position<E> chp2 = ch2.next();
//		if ( ! areIsomorphic( T1, chp1, T2, chp2 ) )
//			return false;
//	}
//	return true;
//}

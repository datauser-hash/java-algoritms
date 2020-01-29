package data_structure.PSS.pss12;//
//import java.util.Pair;
//
//public static Pair< Integer, Node<K> > find<K>(
//		LinkedBinaryTree<K> t, Integer value ) {
//	int depth = 0;
//	Node<K> n = t.getRoot();
//	while ( n != null ) {
//		if ( value < n.getElement() ) {
//			// Go left
//			n = n.getLeft();
//			++depth;
//		}
//		else if ( value > n.getElement() ) {
//			// Go right
//			n = n.getRight();
//			++depth;
//		}
//		else {
//			// Found!
//			return new Pair< Integer, Node<K> >( depth, n );
//		}
//	}
//	// Not found
//	return new Pair< Integer, Node<K> >( -1, null );
//}
//
//public static int distance<K>( LinkedBinaryTree<K> t, K a, K b )
//{
//	// Find depth of 'a'
//	Pair< Integer, Node<K> > aResult = find( t, a );
//	int aDepth = aResult.getFirst();
//	Node<K> aNode = aResult.getSecond();
//	// Find depth of 'b'
//	Pair< Integer, Node<K> > bResult = find( t, b );
//	int bDepth = bResult.getFirst();
//	Node<K> bNode = bResult.getSecond();
//	// Synchronize depths
//	int distnace = 0;
//	while ( aDepth > bDepth ) {
//		// move 'a' up
//		--aDepth;
//		aNode = aNode.getParent();
//		++distance;
//	}
//	while ( aDepth < bDepth ) {
//		// move 'b' up
//		--bDepth;
//		bNode = bNode.getParent();
//		++distance;
//	}
//	// Move up until meeting
//	while ( aNode != bNode ) {
//		aNode = aNode.getParent();
//		bNode = bNode.getParent();
//		distance += 2;
//	}
//	return distance;
//}

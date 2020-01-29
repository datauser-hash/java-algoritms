package data_structure.PSS.pss11;//
///** An implementation of a priority queue using an array−based heap. */
//public class HeapPriorityQueue<K,V> extends AbstractPriorityQueue<K,V> {
//
//	/** primary collection of priority queue entries */
//	protected ArrayList<Entry<K,V>> heap = new ArrayList<>( );
//
//	...
//
//	/** Calculates sum of elements which are inside range [a,b] */
//	int sumBetween( int a, int b ) {
//		return sumBetween( a, b, 0 );
//	}
//
//	/** Calculates sum of elements which are inside range [a,b],
//	 *  in the subtree, parent of which is indexed at 'node'. */
//	int sumBetween( int a, int b, int node ) {
//		// Check if out of range
//		if ( node >= size() )
//			return 0;
//		if ( heap.get(node) > b )
//			return 0;  // Already out of range [a,b]
//		int sum = 0;
//		if ( heap.get(node) >= a )  // If this node is inside [a,b]
//			sum += heap.get(node);
//		sum += sumBetween( a, b, left(node) );
//		sum += sumBetween( a, b, right(node) );
//		return sum;
//	}
//}

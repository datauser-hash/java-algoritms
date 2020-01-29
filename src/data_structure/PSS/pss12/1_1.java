package data_structure.PSS.pss12;//
//public static Integer getKey( Integer value ) {
//	// Calculate sum & number of digits
//	int sum = 0, num = 0;
//	while ( value > 0 ) {
//		sum += value % 10;
//		num++;
//		value /= 10;
//	}
//	// Return the mean
//	return sum / num;
//}
//
//public static void sort( Integer[] a ) {
//	// Put all integers in the map
//	SortedTableMap< Integer, Integer > m = new SortedTableMap< Integer, Integer >();
//	for ( int i = 0; i < a.length; ++i )
//		m.put( getKey( a[i] ), a[i] );
//	// Traverse the map from left to right
//	for ( int i = 0; i < a.length; ++i )
//		a[i] = m.safeEntry( i ).getValue();
//}

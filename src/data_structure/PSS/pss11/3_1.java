package data_structure.PSS.pss11;//
//public static void findFirstNonRepeating( String s, int K ) {
//	// Creat the map
//	UnsortedTableMap<Character, Integer> m = new UnsortedTableMap<Char,Integer>();
//	// Put all characters there
//	for ( int i = 0; i < s.length(); ++i ) {
//		Character ch = s.charAt( i );
//		if ( m.findIndex( ch ) == -1 ) {
//			// The character appears for the first time.
//			m.put( ch, 1 );
//		}
//		else {
//			// The character happend already before
//			m.put( ch, m.get( ch ) + 1 );
//		}
//	}
//	// Find first K non-repeating characters
//	int k = 0;
//	for ( int i = 0; i < m.size() && k < K; ++i ) {
//		MapEntry<Character, Integer> entry = m.table.get(i);
//		if ( entry.getValue() == 1 ) {
//			System.out.print( entry.getKey() );
//			++k;
//		}
//	}
//	System.out.println();
//}

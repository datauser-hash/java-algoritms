package data_structure.PSS.pss06;//
//public static void labyrinth( int M, int N, char[][] lab )
//{
//	int Si, Sj;
//	// ToDo: Find coordinates of start point (Si, Sj)
//	int Ei, Ej;
//	// ToDo: Find coordinates of finish point (Ei, Ej)
//	boolean mark[ M ][ N ];
//	// ToDo: Fill mark with "false" values
//	Queue< Point > q;
//	q.add( new Point( Si, Sj ) );
//	while ( ! q.isEmpty() ) {
//		int Pi, Pj;
//		// ToDo: Get coordinates of front point (Pi, Pj)
//		q.remove();
//		// Mark that from here on, we were present here
//		mark[ Pi ][ Pj ] = true;
//		// Check if we have reached finish point
//		if ( Pi == Ei && Pj == Ej ) {
//			// ToDo: Report that the path is found
//		}
//		// Analyze it's surrounding
//		if ( Pi > 0
//				&& lab[ Pi-1 ][ Pj ] == ' '
//				&& ! mark[ Pi-1 ][ Pj ] ) {
//			// Move to up cell
//			q.add( new Point( Pi-1, Pj ) );
//		}
//		// ToDo: Analyze other 3 directions
//
//	}
//	// ToDo: Report that path doesn't exist
//}

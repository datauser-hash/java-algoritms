package data_structure.PSS.pss10;//
//import java.util.*;
//
//public class BinaryDigitsComparator implements Comparator<Integer> {
//
//	/**
//	 * Returns number of 1(s) in binary representation of 'x'.
//	 */
//	int getNumberOf1s( int x ) {
//		int result = 0;
//		while ( x > 0 ) {
//			if ( x % 2 == 1 )
//				++result;
//			x /= 2;
//		}
//		return result;
//	}
//
//	public int compare( Integer a, Integer b ) {
//		int na = getNumberOf1s( a );
//		int nb = getNumberOf1s( b );
//		return na - nb;
//	}
//}

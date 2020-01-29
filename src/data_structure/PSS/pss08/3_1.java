package data_structure.PSS.pss08;//
//class LinkedPositionalList<E> {
//
//	...
//
//	class AlternateIterator<E> implements Iterator<E> {
//
//		public AlternateIterator( LinkedPositionalList<E> lst ) {
//			// Take starting iterator from the list
//			base = lst.iterator();
//		}
//
//		public boolean hasNext() {
//			// Step 1
//			if ( ! base.hasNext() )
//				return false;
//			// Step 2
//			Iterator<E> base2 = base.clone();
//			base2.next();
//			if ( ! base2.hasNext() )
//				return false;
//			// It has
//			return true;
//		}
//
//		public E next() {
//			// Omit value of step 1
//			base.next();
//			// Return value fo step 2
//			return base.next();
//		}
//
//		public void remove() {
//			// Remove the last iterated element
//			base.remove();
//		}
//
//		private Iterator<E> base;
//	};
//
//	...
//
//	/**
//	 * This method constructs and returns an AlternateIterator
//	 * over elements of this list.
//	 */
//	public AlternateIterator<E> alternateIterator() {
//		return new AlternateIterator<E>( this );
//	}
//
//	...
//}
//

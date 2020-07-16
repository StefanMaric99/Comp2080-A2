package ca.gbc.assignment2.part2;

/***********************************
 * COMP2080 - Assignment 2 File name: Sum.java Author: Last name, first name
 * Email: Your email address
 ************************************/
public class Sum {

	/**
	 * Returns true if array A contains two elements whose sum is k. Returns false
	 * otherwise. n is the number of elements A contains.
	 *
	 * The running time of your algorithm is O( ). You may add a brief explanation
	 * here if you wish.
	 * 
	 * @param A
	 * @param n
	 * @param k
	 * @return
	 */
	public static boolean sum(int[] A, int n, int k) {
		// COMPLETE THIS METHOD.

		// You may define local variables inside this method.

		// You may add your own methods/subroutines to this file.
		if(n < 2) {
			return false;
		}

		for(int i=0; i<n; i++) {
			for(int s=i+1; s<n; s++) {
				if(A[i]+A[s] == k) {
					return true;
				}
			}
		}
		return false;
	} 

	/**
	 * RECURSIVE ALGORITHM Returns true if array A contains two elements whose sum
	 * is k. Returns false otherwise. n is the number of elements A contains.
	 *
	 * The running time of your algorithm is O( ). You may add a brief explanation
	 * here if you wish.
	 * 
	 * @param A
	 * @param n
	 * @param k
	 * @return
	 */
	public static boolean sum_rec(int[] A, int n, int k) {
		// COMPLETE THIS METHOD.

		// You may define local variables inside this method.

		// You may add your own methods/subroutines to this file.

		if(n < 1) return false;

		int current = A[A.length - n];
		// System.out.println("N: " + current);

		for(int i=A.length-n+1; i<A.length; i++) {
			// System.out.println(current + " - " + arr[i]);
			System.out.println(current + " - " + A[i] + " " + k + " " + n);

			if(current+A[i] == k) {
				System.out.println("TEST");
				return true;
			}
		}

		return sum_rec(A, n-1, k);

	} 

}

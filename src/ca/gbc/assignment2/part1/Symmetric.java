package ca.gbc.assignment2.part1;
/***********************************
 * COMP2080 - Assignment 2 File name: Symmetric.java Author: Last name, first
 * name Email: Your email address
 ************************************/
public class Symmetric {

	/**
	 * Returns true if array A is symmetric. Returns false otherwise. n is the
	 * number of elements A contains.
	 * 
	 * The running time of your algorithm is O( ). You may add a brief explanation
	 * here if you wish.
	 * 
	 * @param A
	 * @param n
	 * @return
	 */
	public static boolean symmetric(int[] A, int n) {
		// COMPLETE THIS METHOD.
		if(n == A.length/2) return true;

//		System.out.println(A[A.length - n] + " - " + A[n-1]);

		if(A[A.length - n] == A[n - 1]) {
			n--;
			return symmetric(A,n);
		} else {
			return false;
		}
	}

}

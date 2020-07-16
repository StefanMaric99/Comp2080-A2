package ca.gbc.assignment2.part4;

/***********************************
 * COMP2080 - Assignment 2 File name: kthsmallest.java 
 * Author: Last name, first
 * name Email: Your email address
 ************************************/
public class KthSmallest {

	public static final int MaxSize = 500;

	/**
	 * Return the value of the kth smallest element of array A. n is the number of
	 * elements A contains, and k <= n.
	 * 
	 * The running time of your algorithm must be O(n).
	 * 
	 * @param A
	 * @param n
	 * @param k
	 * @return
	 */

		// COMPLETE THIS METHOD.

		// You may define local variables inside this method.

		// You may add your own methods/subroutines to this file.

	public static int find_kth_smallest(int[] arrA, int n, int k) {
		k = k - 1; // since array index starts with 0
		return find_kth_smallest(arrA, 0, n-1, k);
	}

	public static int find_kth_smallest(int[] arrA, int start, int end, int k) {
		int left = start;
		int right = end;
		int pivot = start;
		while (left <= right) {
			while (left <= right && arrA[left] <= arrA[pivot])
				left++;
			while (left <= right && arrA[right] >= arrA[pivot])
				right--;
			if (left < right) {
				swap(arrA, left, right);
				left++;
				right--;
			}
		}
		swap(arrA, pivot, right);
		if (pivot == k)
			return arrA[pivot];// if pivot is kth element , return
		else if (pivot < k)
			// if pivot is less than k, then kth element will be on the right
			return find_kth_smallest(arrA, pivot + 1, end, k);
		else
			// if pivot is greater than k, then kth element will be on the right
			return find_kth_smallest(arrA, start, pivot - 1, k);
	}

	public static void swap(int[] arrA, int left, int right) {
		int x = arrA[left];
		arrA[left] = arrA[right];
		arrA[right] = x;
	}

}
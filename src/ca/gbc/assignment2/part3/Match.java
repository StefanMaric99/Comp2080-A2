package ca.gbc.assignment2.part3;
/***********************************
* COMP2080 - Assignment 2
* File name: Match.java
* Author: Last name, first name
* Email: Your email address
************************************/
public class Match {

/**
 * Returns index i if array A contains an element A[i] such that A[i] = i.
 * If there exist many of such elements, return the index of any one of them.
 * Returns -1 if there exists no element A[i] such that A[i] == i.
 * n is the number of elements A contains.
 *
 * The running time of your algorithm is O(  ).
 * You may add a brief explanation here if you wish.
 * 
 * @param A
 * @param n
 * @return
 */
public static int match( int[] A, int n ) 
{
   // COMPLETE THIS METHOD.

   // You may define local variables inside this method.

   // You may add your own methods/subroutines to this file.
    for(int i=0; i<n; i++) {
        if(A[i] == i) {
            return i;
        }
    }
    return -1;
} 

/**
 * Returns index i if array A contains an element A[i] such that A[i] = i.
 * If there exist many of such elements, return the index of any one of them.
 * Returns -1 if there exists no element A[i] such that A[i] == i.
 * n is the number of elements A contains.
 *
 * The running time of your algorithm is O(  ).
 * You may add a brief explanation here if you wish.
 * @param A
 * @param n
 * @return
 */
public static int match_rec( int[] A, int n )
{
    if(n < 1) return -1;

    if(A[n-1] == n-1) {
        return n-1;
    }
    return match_rec(A, n-1);

}


} // end class


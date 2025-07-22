/*
 * Find the Largest Element in an Array
    Given an array, find the largest element.
	• Example: arr = [10, 324, 45, 90, 98]
		○ Output: 324
 */
package dsa.array.easy;

/**
 *
 * @author Aryan
 */
public class Problem1 {

    public static void main(String[] args) {
        int[] arr = {10, 324, 45, 90, 98};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element : " + largest);
    }
}

/*  this is the best solution.
    Time Complexity : O(n).
*/

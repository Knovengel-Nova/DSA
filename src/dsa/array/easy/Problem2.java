/*
 * Check if an Array is Sorted
    Determine if an array is sorted in non-decreasing order.
	• Example: arr = [1, 2, 3, 4, 5]
		○ Output: True
	• Example: arr = [1, 3, 2, 4, 5]
		○ Output: False
 */
package dsa.array.easy;

/**
 *
 * @author Aryan
 */
public class Problem2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 5};
        System.out.println("Result : " + isSorted(arr2));
    }

    public static boolean isSorted(int[] arr) {

        for (int i = 1, j = 0; i < arr.length; i++, j++) {
            System.out.println("i: " + i + "(" + arr[i] + ") j: " + j + "(" + arr[j] + ").\t is(" + arr[j] + ">" + arr[i] + ")? : " + (arr[j] > arr[i]));
            if (arr[j] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}

/*
    This is the best solution.
    Time Complexity : O(n).
 */

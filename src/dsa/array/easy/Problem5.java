/*
 * Move Zeros to End
    Given an array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	• Example: arr = [0, 1, 0, 3, 12]
		○ Output: [1, 3, 12, 0, 0]
 */
package dsa.array.easy;

/**
 *
 * @author Aryan
 */
public class Problem5 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 0, 9};
        System.out.print("Old Array : ");
        displayArray(arr);
        arr = opOnArray(arr);
        System.out.print("New Array : ");
        displayArray(arr);
    }

    public static void displayArray(int[] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : " }\n"));
        }
    }

    public static int[] opOnArray(int arr[]) {
        if (arr.length == 0) {
            return null;
        }

        int[] new_arr = new int[arr.length];

        int numOfZeros = 0, j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                new_arr[j++] = arr[i];
            } else {
                numOfZeros++;
            }
        }

        if (numOfZeros > 0) {
            for (int i = 0; i < numOfZeros; i++) {
                new_arr[j++] = 0;
            }
        }

        return new_arr;
    }
}

/*
    This is the best solution. First try!!!!
    Time complexity : O(n).
    but space complexity is O(n).
    we can make it O(1) by making inplace changes to the array,
    instead of making another array of the size n(arr.length).

    use two pointer approach. in the following way:
    
    The in-place approach also uses two pointers:

        1.  Write Pointer (j): Points to the next position where a non-zero element should be placed. It starts at 0.

        2.  Read Pointer (i): Iterates through the entire array.

    Logic (Mental Walkthrough):

        1.  Iterate readPointer (i) from the beginning of the array.

        2.  If arr[i] is not zero:

            a.  Copy arr[i] to arr[j] (the position of the write pointer).

            b.  Increment j.

        3.  After the first pass, all non-zero elements will be at the beginning of the array, 
            correctly ordered, and j will be at the index where the zeros should start.

        4.  Then, iterate from j to the end of the array, filling the remaining elements with zeros.

    This O(n) time, O(1) space solution is often preferred in competitive programming and interviews when memory efficiency is critical. 
    Our current solution is good for understanding the logic, but be aware of this in-place variant.
 */

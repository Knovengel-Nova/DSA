/*
 * Rotate Array
    Rotate an array by k steps to the right.
	• Example: arr = [1, 2, 3, 4, 5, 6, 7], k = 3
                          0  1  2  3  4  5  6  
		○ Output: [5, 6, 7, 1, 2, 3, 4]
                            0  1  2  3  4  5  6
 */
package dsa.array.easy;

/**
 *
 * @author Aryan
 */
public class Problem4 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Old array: ");
        displayArray(arr);
        System.out.println("New array: ");
        displayArray(rotate(arr, 3));
    }

    public static void displayArray(int[] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.print(" }\n");
    }

    public static int[] rotate(int[] arr, int k) {
        if (arr.length == 0) {
            return null;
        }

        // Ensure k is within the bounds of the array length
        // A rotation by n steps is equivalent to no rotation.
        k = k % arr.length; 
        
        if (k == 0) {
            return arr;
        }

        int[] new_arr = new int[arr.length];

        // First loop copies the last k elements to the beginning og the new_arr.
        for (int i = 0; i < k; i++) {
            new_arr[i] = arr[arr.length - k + i];
        }

        // copy the first n-k elements to the remaining position ( n = arr.length ).
        for (int i = 0; i < arr.length - k; i++) {
            new_arr[k + i] = arr[i];
        }

        return new_arr;
    }
}

/*
    This code:
    // First approach
    public static int[] rotate(int[] arr, int k) {
        int n = k + 1;
        int[] new_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (n >= arr.length) {
                n = 0;
            }
            new_arr[i] = arr[n];
            n++;
        }

        return new_arr;
    }
    has issues. it only works for the given problem.
    
    Reasons:
        Incorrect Start Index n = k+1: For a right rotation by k steps, 
        the elements that move to the beginning are the last k elements of the original array. 
        These elements start at index arr.length - k. Your k+1 calculation is incorrect.

        Logic for Wrapping Around: While you use if(n>=arr.length){ n = 0; }, 
        the overall logic of filling new_arr[i] = arr[n] based on your n calculation is flawed for correct rotation. 
        It's trying to map elements from the original array to the new array, but the mapping is off.
 */

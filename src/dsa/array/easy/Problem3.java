/*
 * Remove Duplicates from a Sorted Array
    Given a sorted array, remove the duplicates in-place such that each unique element appears only once. 
    The relative order of the elements should be kept the same. You typically return the new length of the array.
	• Example: arr = [1, 1, 2, 2, 3, 4, 4]
		○ Output (modified array and new length): [1, 2, 3, 4, _ , _ , _] and 
                   length 4 (the underscores indicate elements beyond the new length that don't matter).
 */
package dsa.array.easy;

/**
 *
 * @author Aryan
 */
public class Problem3 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        System.out.print("Old array : ");
        displayArray(arr);
        int newLen = 0;

        for (int i = 0, j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[++i] = arr[j];
            }
            newLen = i;
        }
        newLen++;

        System.out.print("New Array : ");
        displayArray(arr);
        System.out.println("Length : " + newLen);

    }

    public static void displayArray(int[] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+((i<arr.length-1)?", ":" }\n"));
        }
    }
}

/*
    This is the best solution,
    but it is expected to make a different method to return the length of the new array(from line 51).
    Time complexity : O(n).

    public static int countLines(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int i = 0;
        for (j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[++i] = arr[j];
            }
        }

        return i + 1;
    }
*/

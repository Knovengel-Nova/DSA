/*
 * Two Sum
    Given an array of integers nums and an integer target, return indices of the two numbers such that,
    they add up to target. Assume that each input would have exactly one solution, and you may not use the same element twice.
	• Example: nums = [2, 7, 11, 15], target = 9
		○ Output: [0, 1] (because nums[0] + nums[1] == 9)
 */

package dsa.array.medium;

/**
 *
 * @author Aryan
 */
public class Problem1 {
    public static void main(String[] args){
        int[] arr = {2, 7, 11, 15};
        int target = 26;
        int[] res = getSolution(arr, target);
        System.out.println("Target "+target+((res == null)?(" was not in the arr."):(" found at the location ("+res[0]+", "+res[1]+").")));
    }
    
    public static int[] getSolution(int[] arr, int target){
        int[] op = {0, 0};
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    op[0] = i;
                    op[1] = j;
                    return op;
                }
            }
        }
        
        return null;
    }
}

/*
    This is the best solution is you only use arrays.
    Time complexity : O(n^2).

    but we can sort the array first useing merge sort and then use two pointer approach.
    Time complexity : O(nlog(n)).

    else two sum problem is best solved using hash map/hash table.
    Time complexity : O(n).
*/

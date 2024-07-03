/***************************************************************************************************
 * 
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
 * find two numbers such that they add up to a specific target number. Let these two numbers 
 * be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 *  
 * Return the indices of the two numbers, index1 and index2, added by one as an 
 * integer array [index1, index2] of length 2.
 * 
 * The tests are generated such that there is exactly one solution. 
 * You may not use the same element twice.
 * 
 * 
 * Your solution must use only constant extra space.
 *
 ****************************************************************************************************/

public class TwoSumII {
    public int[] twoSumSorted(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int num1 = numbers[low];
        int num2 = numbers[high];

        while ((num1 + num2) != target) {
            if ((num1 + num2) < target)
                num1 = numbers[++low];
            else 
                num2 = numbers[--high];
        }
        
        int[] soln = {++low, ++high};
        return soln;
    }

    public static void main (String[] args) {
        TwoSumII soln = new TwoSumII();

        // Test Case 1
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        int[] answer1 = new int[2];
        answer1 = soln.twoSumSorted(nums1, target1);
        System.out.print("Expected:[1, 2] --> Result:[");
        System.out.print(answer1[0] + ", ");
        System.out.println(answer1[1] + "]");

        // Test Case 2
        int[] nums2 = {2,3,4};
        int target2 = 6;
        int[] answer2 = new int[2];
        answer2 = soln.twoSumSorted(nums2, target2);
        System.out.print("Expected:[1, 3] --> Result:[");
        System.out.print(answer2[0] + ", ");
        System.out.println(answer2[1] + "]");

        // Test Case 3
        int[] nums3 = {-1,0};
        int target3 = -1;
        int[] answer3 = new int[2];
        answer3 = soln.twoSumSorted(nums3, target3);
        System.out.print("Expected:[1, 2] --> Result:[");
        System.out.print(answer3[0] + ", ");
        System.out.println(answer3[1] + "]");
    }

}
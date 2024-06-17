import java.util.Arrays;

/*********************************************************************************
 * 
 * Given an integer array nums, return true if any value appears at least twice 
 * in the array, and return false if every element is distinct.
 * 
 ******************************************************************************/



public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }

    public static void main (String[] args) {
        ContainsDuplicate soln = new ContainsDuplicate();

        // Test Case 1
        int[] nums1 = {1,2,3,1};
        boolean bool1 = soln.containsDuplicate(nums1);
        System.out.println("true ---> " + bool1);

        // Test Case 2
        int[] nums2 = {1,2,3,4};
        boolean bool2 = soln.containsDuplicate(nums2);
        System.out.println("false --> " + bool2);

        // Test Case 3
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        boolean bool3 = soln.containsDuplicate(nums3);
        System.out.println("true ---> " + bool3);

        // Test Case 4
        int[] nums4 = {1};
        boolean bool4 = soln.containsDuplicate(nums4);
        System.out.println("false --> " + bool4);
    }

}

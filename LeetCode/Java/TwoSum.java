import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) {
            int[] arr = {map.get(target - nums[i]), i};
            return arr;
        }
        map.put(nums[i], i);
      }
      return null;
    }

    public static void main(String args[]) {
        TwoSum soln = new TwoSum();

        // Test Case 1
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        int[] answer1 = new int[2];
        answer1 = soln.twoSum(nums1, target1);
        System.out.print("Expected:[0, 1] --> Result:[");
        System.out.print(answer1[0] + ", ");
        System.out.println(answer1[1] + "]");

        // Test Case 2
        int[] nums2 = {3,2,4};
        int target2 = 6;
        int[] answer2 = new int[2];
        answer2 = soln.twoSum(nums2, target2);
        System.out.print("Expected:[1, 2] --> Result:[");
        System.out.print(answer2[0] + ", ");
        System.out.println(answer2[1] + "]");

        // Test Case 3
        int[] nums3 = {3,3};
        int target3 = 6;
        int[] answer3 = new int[2];
        answer3 = soln.twoSum(nums3, target3);
        System.out.print("Expected:[0, 1] --> Result:[");
        System.out.print(answer3[0] + ", ");
        System.out.println(answer3[1] + "]");
    }
}

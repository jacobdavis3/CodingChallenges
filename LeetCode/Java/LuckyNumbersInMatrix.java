/**********************************************************************
 * Given an m x n matrix of distinct numbers, return all lucky numbers 
 * in the matrix in any order.
 *
 * 
 * A lucky number is an element of the matrix such that it is the 
 * minimum element in its row and maximum in its column.
 **********************************************************************/

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInMatrix {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int rowMin = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    minIndex = j;
                }
            }
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minIndex] > rowMin) {
                    rowMin = -1;
                }
            }

            if (rowMin > 0) {
                nums.add(rowMin);
            }

        }
        return nums;
    }

    public static void main (String[] args) {
        LuckyNumbersInMatrix soln = new LuckyNumbersInMatrix();

        // Test Case 1
        int[][] nums1 = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> answer1 = new ArrayList<>();
        answer1 = soln.luckyNumbers(nums1);
        System.out.println("Should be 15, is " + answer1);
        
        // Test Case 2
        int[][] nums2 = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> answer2 = new ArrayList<>();
        answer2 = soln.luckyNumbers(nums2);
        System.out.println("Should be 12, is " + answer2);

        // Test Case 3
        int[][] nums3 = {{7,8},{1,2}};
        List<Integer> answer3 = new ArrayList<>();
        answer3 = soln.luckyNumbers(nums3);
        System.out.println("Should be 7, is " + answer3);
    }
}

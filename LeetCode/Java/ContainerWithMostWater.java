/*****************************************************************************************
*
* You are given an integer array height of length n. There are n vertical lines drawn such 
* that the two endpoints of the ith line are (i, 0) and (i, height[i]).
*
* Find two lines that together with the x-axis form a container, such that the container 
* contains the most water.
*
* Return the maximum amount of water a container can store.
*
******************************************************************************************/

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int max = 0;
        int front = 0;
        int back = height.length - 1;

        while (front < back) {
            int width = back - front;
            int length = Math.min(height[front], height[back]);
            int area = length * width;

            if (area > max) max = area;

            // Advance from the position with the smaller height
            // If not smaller, might not find max area
            if (length == height[front]) front++;
            else back--;
        }

        return max;
    }

    public static void main(String[] args) {
        ContainerWithMostWater container = new ContainerWithMostWater();
    
        // Test Case 1
        int[] a = {1,8,6,2,5,4,8,3,7};
        int soln = container.maxArea(a);
        System.out.println("Answer should be 49 ---> " + soln);

        // Test Case 2
        int[] b = {1,1};
        soln = container.maxArea(b);
        System.out.println("Answer should be 1 ----> " + soln);
    }
}
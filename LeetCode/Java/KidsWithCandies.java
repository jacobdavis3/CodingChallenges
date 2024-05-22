/***********************************************************************************************************
 * 
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents 
 * the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies 
 * that you have. 
 * 
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the 
 * extraCandies, they will have the greatest number of candies among all the kids, or false otherwise. 
 * 
 * Note that multiple kids can have the greatest number of candies.
 * 
 ************************************************************************************************************/
import java.util.ArrayList;
import java.util.List;


public class KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        // Find the greatest number of candies a kid has
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        List<Boolean> list = new ArrayList<>();

        // Determine if adding extraCandies to a kid's candies would
        // leave the kid with the greatest number of candies
        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= max) {
                list.add(true);
            }
            else list.add(false);
        }
        return list;
    }

    public static void main (String[] args) {
        KidsWithCandies method = new KidsWithCandies();

        // Test Case 1
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> soln = new ArrayList<>();
        soln = method.kidsWithCandies(candies, extraCandies);
        System.out.print("[true, true, true, false, true]  --> ");
        System.out.println(soln);

        // Test Case 2
        candies = new int[]{4,2,1,1,2};
        extraCandies = 1;
        soln = method.kidsWithCandies(candies, extraCandies);
        System.out.print("[true, false, false, false, false]   --> ");
        System.out.println(soln);

        // Test Case 3
        candies = new int[]{12,1,12};
        extraCandies = 10;
        soln = method.kidsWithCandies(candies, extraCandies);
        System.out.print("[true, false, true]   --> ");
        System.out.println(soln);
    }

}
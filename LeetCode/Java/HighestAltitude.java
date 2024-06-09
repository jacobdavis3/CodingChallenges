/***********************************************************************************************************
 * 
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. 
 * The biker starts his trip on point 0 with altitude equal 0.
 *
 * 
 * You are given an integer array gain of length n where gain[i] is the net gain in altitude between 
 * points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
 * 
 ************************************************************************************************************/


public class HighestAltitude {

    public int largestAltitude(int[] gain) {
        int max = 0;
        int curAlt = 0;
        for (int i = 0; i < gain.length; i++) {
            curAlt += gain[i];
            max = Math.max(curAlt, max);
        }
        return max;
    }

    public static void main (String[] args) {
        HighestAltitude alt = new HighestAltitude();

        // Test Case 1
        int[] gain = {-5,1,5,0,-7};
        int soln = alt.largestAltitude(gain);
        System.out.print("Highest altitude should be 1 --> ");
        System.out.println(soln);

        // Test Case 2
        int[] gain1 = {-4,-3,-2,-1,4,3,2};
        int soln1 = alt.largestAltitude(gain1);
        System.out.print("Highest altitude should be 0 --> ");
        System.out.println(soln1);
    }

}
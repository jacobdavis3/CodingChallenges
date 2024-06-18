import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String (c); 
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams soln = new GroupAnagrams();

        // Test Case 1
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result1 = soln.groupAnagrams(strs1);
        System.out.println("Test Case 1:");
        System.out.println("Reference --> [[eat, tea, ate], [bat], [tan, nat]]");
        System.out.println("Results ----> " + result1);
        System.out.println();

         // Test Case 2
         String[] strs2 = {""};
         List<List<String>> result2 = soln.groupAnagrams(strs2);
         System.out.println("Test Case 2:");
         System.out.println("Reference --> [[]]");
         System.out.println("Results ----> " + result2);
         System.out.println();

         // Test Case 3
         String[] strs3 = {"a"};
         List<List<String>> result3 = soln.groupAnagrams(strs3);
         System.out.println("Test Case 3:");
         System.out.println("Reference --> [[a]]");
         System.out.println("Results ----> " + result3);
    }
}

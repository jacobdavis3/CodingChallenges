/***************************************************************************************************
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 * typically using all the original letters exactly once.
 * 
 ***************************************************************************************************/

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);

        if (s1.length != t1.length)
            return false;

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != t1[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram soln = new ValidAnagram();

        // Test Case 1
        String s1 = "anagram";
        String s2 = "nagaram";
        boolean bool = soln.isAnagram(s1, s2);
        System.out.println("true ---> " + bool);

        // Test Case 2
        String s1a = "rat";
        String s2a = "car";
        bool = soln.isAnagram(s1a, s2a);
        System.out.println("false --> " + bool);

        // Test Case 3
        String s1b = "a";
        String s2b = "ab";
        bool = soln.isAnagram(s1b, s2b);
        System.out.println("false --> " + bool);
    }

}

/*******************************************************************************************************
 * 
 * You are given two strings word1 and word2. 
 * Merge the strings by adding letters in alternating order, starting with word1. 
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 * 
 * Return the merged string.
 * 
 *******************************************************************************************************/

public class MergeAlternately {

    public String mergeAlternately(String word1, String word2) {    
        int i = 0;
        StringBuilder s = new StringBuilder();

        // Alternate words until one word is used up
        while (i < word1.length() && i < word2.length()) {
            s.append(word1.charAt(i));
            s.append(word2.charAt(i));
            i++;
        }

        // Either word1 or word2 is going to be used up
        // So append the rest of the remaining word
        while (i < word2.length()) {
                s.append(word2.charAt(i));
                i++;
            }
       
        while (i < word1.length()) {
                s.append(word1.charAt(i));
                i++;
        }

        return s.toString();
    }

    public static void main (String[] args) {
        MergeAlternately merged = new MergeAlternately();
        // Test Case 1
        String word1 = "abc";
        String word2 = "pqr";
        String solution = merged.mergeAlternately(word1, word2);
        System.out.println("Solution should be apbqcr and is " + solution);
        
        // Test Case 2
        word1 = "ab";
        word2 = "pqrs";
        solution = merged.mergeAlternately(word1, word2);
        System.out.println("Solution should be apbqrs and is " + solution);

        // Test Case 3
        word1 = "abcd";
        word2 = "pq";
        solution = merged.mergeAlternately(word1, word2);
        System.out.println("Solution should be apbqcd and is " + solution);
    }

}
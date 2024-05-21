public class Palindrome {

/* Given an integer x, return true if x is a palindrome, and false otherwise. */
public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String s = Integer.toString(x);
        int first = 0;
        int last = s.length() - 1;
    
        // Check digit at front of number is same as at end of number
        while (first <= last && s.charAt(first) == s.charAt(last)) {
            first++;
            last--;
        }
        // Edge case: Input is only one digit
        if (last < 0) return true;

        if (s.charAt(first) != s.charAt(last)) return false;
        return true;
    }

public static void main (String args[]) {
    Palindrome p = new Palindrome();
    // Test Case 1
    boolean j = p.isPalindrome(121);
    System.out.println("true  --> " + j);
     // Test Case 2
    j = p.isPalindrome(-121);
    System.out.println("false --> " + j);
     // Test Case 1
    j = p.isPalindrome(10);
    System.out.println("false --> " + j);
}
}
/*******************************************************************************************************
 * 
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the original string by deleting some 
 * (can be none) of the characters without disturbing the relative positions of the remaining characters. 
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * 
 *******************************************************************************************************/



#include <stdio.h>
#include <stdlib.h>

// Define an enum for boolean values
typedef enum { false, true } bool;

bool isSubsequence(char* s, char* t) {
    if (*s == '\0') return true;
    while (*t != '\0') {
        if (*s == *t) s++;
        if (*s == '\0') return true;
        t++;
    }

    return false;
}


int main() {
    int case1, case2, case3;

   // Test Case 1
    case1 = isSubsequence("abc", "ahbgdc");
    printf("Should be (1) and is %d\n", case1);
    
    // Test Case 2
    case2 = isSubsequence("axc", "ahbgdc");
    printf("Should be (0) and is %d\n", case2);
    
    // Test Case 3
    case3 = isSubsequence("", ""); 
    printf("Should be (1) and is %d\n", case3);
    
    return EXIT_SUCCESS;
}
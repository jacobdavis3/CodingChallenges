#include <stdio.h>

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.



Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*/

int romanToInt(char* s) {
    int result = 0;
   
    int i = 0;
    while (s[i] != '\0') {
        if (s[i] == 'M') result += 1000;
        if (s[i] == 'D') result += 500;
        if (s[i] == 'C') {
            if (s[i + 1] == 'M' || s[i+1] == 'D') result -= 100;
            else result += 100;
        }
        if (s[i] == 'L') result += 50;
        if (s[i] == 'X') {
            if (s[i+1] == 'L' || s[i+1] == 'C') result -= 10;
            else result += 10;
        }
        if (s[i] == 'V') result += 5;
        if (s[i] == 'I') {
            if (s[i+1] == 'V' || s[i+1] == 'X') result -= 1;
            else result++;
        }
     i++;
    }

    return result;
}


int main() {
    // First Test Case
    char* s = "III";
    printf("test 1 (3) %d\n", romanToInt(s));
    // Second Test Case
    s = "LVIII";
    printf("test 2 (58) %d\n", romanToInt(s));
    // Third Test Case
    s = "MCMXCIV";
    printf("test 3 (1994) %d\n", romanToInt(s));
    return 0;
}
'''

Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string 
should only have a single space separating the words. Do not include any extra spaces.

'''


class Solution:
    def reverseWords(self, s: str) -> str:
        stack = []

        word = ''
        for c in s:
            if c != ' ':
                word += c
            elif word:
                stack.append(word)
                word = ''
        stack.append(word)
        
        soln = ''
        while stack:
            soln += stack.pop()
            if stack:
                soln += ' '
        
        return soln.strip()
    

def main():
    # Create an instance of the Solution class
    solution = Solution()
    
    # Test Case 1
    print()
    input1 = "the sky is blue"
    result1 = solution.reverseWords(input1)
    print(f"Expected Words: 'blue is sky the'")
    print(f"Reversed Words: '{result1}'")

    # Test Case 2
    print()
    input2 = "  hello world  "
    result2 = solution.reverseWords(input2)
    print(f"Expected Words: 'world hello'")
    print(f"Reversed Words: '{result2}'")

    # Test Case 3
    print()
    input3 = "a good   example"
    result3 = solution.reverseWords(input3)
    print(f"Expected Words: 'example good a'")
    print(f"Reversed Words: '{result3}'")

if __name__ == "__main__":
    main()
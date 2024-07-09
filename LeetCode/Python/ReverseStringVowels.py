'''

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

s consist of printable ASCII characters

'''


class Solution:
    def reverseVowels(self, s) -> str:
        vowels = ['a', 'e', 'i', 'o', 'u']
        list_vowels = []
        new_s = ''

        for letter in s:
            if letter.lower() in vowels:
                list_vowels.append(letter)
                new_s += '\n'
            else:
                new_s += letter

        final_s = ''

        for char in new_s:
            if char == '\n':
                final_s += list_vowels.pop()
            else:
                final_s += char

        return final_s



def main():
    solution = Solution()

    # Test Case 1
    s1 = "hello"
    print('Output should be ("holle")', solution.reverseVowels(s1))

    # Test Case 2
    s2 = "leetcode"
    print('Output should be ("leotcede")', solution.reverseVowels(s2))
    

if __name__ == "__main__":
    main()
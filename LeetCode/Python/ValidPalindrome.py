class Solution:
    def isPalindrome(self, s: str) -> bool:
        formatted_str = ""
        for c in s:
            if c.isalnum():
                formatted_str += c.lower()
        
        count = 1
        for c in formatted_str:
            if c != formatted_str[len(formatted_str) - count]:
                return False
            count += 1
        return True
    

class TestSolution:
    def __init__(self):
        self.solution = Solution()
        
    def run_tests(self):
        test_cases = {
            "A man, a plan, a canal: Panama": True,
            "race a car": False,
            "": True,
            "Able , was I saw eLba": True,
            "No lemon, no melon": True,
            "12321": True,
            "12345": False,
            "Madam In Eden, I’m Adam": True,
            "Was it a car or a cat I saw?": True
        }
        
        for s, expected in test_cases.items():
            result = self.solution.isPalindrome(s)
            assert result == expected, f"Test failed for input: '{s}'. Expected: {expected}, Got: {result}"
        
        print("All tests passed!")


# Running the test client
test_client = TestSolution()
test_client.run_tests()
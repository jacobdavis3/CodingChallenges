'''
You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

'''

class Solution:
    def evalRPN(self, tokens: list[str]) -> int:
        stack = []
        for c in tokens:
            if c.lstrip('-').isdigit():
                stack.append(int(c))
            else:
                if len(stack) == 1:
                    break
                int1 = stack.pop()
                int2 = stack.pop()
                if c == '+':
                    stack.append(int1 + int2)
                elif c == '-':
                    stack.append(int2 - int1)
                elif c == '*':
                    stack.append(int1 * int2)
                else:
                    stack.append(int(int2 / int1))
        return stack.pop()
    
def main():
    solution = Solution()
    
    # Test cases
    test_cases = [
        (["2", "1", "+", "3", "*"], 9),  # (2 + 1) * 3 = 9
        (["4", "13", "5", "/", "+"], 6),  # 4 + (13 / 5) = 6
        (["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"], 22)
    ]
    
    for i, (tokens, expected) in enumerate(test_cases):
        result = solution.evalRPN(tokens)
        print(f"Test Case {i + 1}")
        print(f"Input tokens: {tokens}")
        print(f"Expected: {expected} --> Result: {result}")
        print("------------------------------------------------")

if __name__ == "__main__":
    main()

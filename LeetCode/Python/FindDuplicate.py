'''
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

'''

class Solution:
    def findDuplicate(self, nums) -> int:
        no_repeats = set()

        for num in nums:
            if num in no_repeats:
                return num
            else:
                no_repeats.add(num)


def main():
    solution = Solution()

    # Test Case 1
    nums1 = [1,3,4,2,2]
    print('Output should be (2)', solution.findDuplicate(nums1))

    # Test Case 2
    nums2 = [3,1,3,4,2]
    print('Output should be (3)', solution.findDuplicate(nums2))

    # Test Case 3
    nums3 = [3,3,3,3,3]
    print('Output should be (3)', solution.findDuplicate(nums3))
    

if __name__ == "__main__":
    main()
class Solution:
    def isPalindrome(self, x: int) -> bool:
        reverse = 0
        original = x
        if x > 0:
            while x:
                remainder = x % 10
                reverse = (reverse * 10) + remainder
                x = int(x/10)
            return (reverse == original)
        elif x < 0:
            return False
        else:
            return True
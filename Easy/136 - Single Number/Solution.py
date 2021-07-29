class Solution:
    def isPalindrome(self, s: str) -> bool:
        i = 0
        j = len(s) - 1
        left, right = "", ""
        s = s.lower()
        
        for i in range(0, len(s)):
            if s[i].isalnum():
                left += s[i]
                
        for j in range(len(s) -1, -1, -1):
            if s[j].isalnum():
                right += s[j]
                
        return left == right

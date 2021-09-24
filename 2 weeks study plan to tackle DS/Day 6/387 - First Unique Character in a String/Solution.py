class Solution:
    def firstUniqChar(self, s: str) -> int:
        for i in range(len(s)):
            check = s[0:i] + s[i+1:]
            if s[i] in check:
                continue
            else:
                return i
        return -1
            

roman = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
class Solution:    
    def romanToInt(self, s: str) -> int:
        if s == None:
            return 0
        prev = roman[s[0]]
        res = prev
        for i in range(1, len(s)):
            cur = roman[s[i]]
            if cur > prev:
                res += (cur - 2*prev)
            else:
                res += cur            
            prev = cur
        return res
    
            
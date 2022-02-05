class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if haystack == None or needle == None:
            return 0
        if haystack==needle:
            return 0
        for i in range(len(haystack)):
            if (needle == haystack[i:i+len(needle)]):
                return i
        return -1
        

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        lcp = ""
        if strs is None or len(strs) == 0:
            return lcp
        minLength = len(strs[0])
        for i in range(0, len(strs)):
            minLength = min(minLength, len(strs[i]))
            
        for i in range(0, minLength):
            value = strs[0][i]
            for j in range(0, len(strs)):
                if strs[j][i] != value:
                    return lcp
            lcp += value
        return lcp
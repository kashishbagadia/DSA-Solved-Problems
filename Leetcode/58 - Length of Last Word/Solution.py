class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        words = s.split()
        if len(words) == 0 or len(s) == 0:
            return 0
        else:
            return len(words[len(words)-1])
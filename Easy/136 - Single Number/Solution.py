class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        counts = {}
        for i in nums:
            if i not in counts:
                counts[i] = 1
            else:
                del counts[i]
        return list(counts.keys())[0]

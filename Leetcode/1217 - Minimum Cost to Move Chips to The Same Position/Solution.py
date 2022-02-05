class Solution:
    def minCostToMoveChips(self, position: List[int]) -> int:
        even = 0
        odd = 0
        for i in position:
            if i % 2 == 0:
                even +=1
            else:
                odd += 1
        if even == len(position) or odd == len(position):
            return 0
        else:
            return min(even, odd)
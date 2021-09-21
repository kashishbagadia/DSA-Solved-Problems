from collections import Counter
class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        if len(nums1) > len(nums2):
            nums1, nums2 = nums2, nums1
    
        ans = []
        d = Counter(nums2)

        for x in nums1:
            if d[x]>0:
                ans.append(x)
                d[x] -= 1
        
        return ans

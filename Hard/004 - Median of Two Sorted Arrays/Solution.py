class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        m = len(nums1)
        n = len(nums2)
        j=0
        for i in range(m, m+n):
            nums1.append(nums2[j])
            j = j + 1

        nums1 = sorted(nums1)
        m1 = len(nums1)

        if m1%2 == 0:
            return (nums1[(m1//2)-1] + nums1[(m1//2)])/2
        else:
            return nums1[((m1+1)//2)-1]

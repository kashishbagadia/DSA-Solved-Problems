class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maximum = max(nums) # find the maximun number present in the list
        if maximum < 0: # if the list contains only the negative numbers we return the maximum number
            return maximum
        msf = 0 # max so far
        meh = 0 # max ending here
        for i in nums:
            meh = meh + i
            meh = max(meh,0)
            msf = max(msf, meh)
        return msf

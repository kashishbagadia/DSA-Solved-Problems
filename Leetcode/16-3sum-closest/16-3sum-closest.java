class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int msum = Integer.MAX_VALUE, ans=0;
        for(int i = 0; i < nums.length; i++){
            
                int lo = i+1, hi = nums.length-1;
                while(lo<hi){
                  if((nums[i]+nums[lo]+nums[hi])==target) return target;
                  else if((Math.abs(nums[i]+nums[lo]+nums[hi] - target)) < msum){
                            msum = Math.abs(target - (nums[i]+nums[lo]+nums[hi]));
                            ans = nums[i]+nums[lo]+nums[hi];
                            
                  }
                  if(nums[lo]+nums[hi]+nums[i] < target) lo++;
                  else hi--;
                }                
            
        }
        return ans;
    }
}
public class max_sum_subarray_asc {
    class Solution {
        public int maxAscendingSum(int[] nums) {
            int cs=nums[0],ms=nums[0];
            for(int i=1;i<nums.length;i++){
                if(nums[i]>nums[i-1]){
                    cs+=nums[i];
                }else{
                    ms=Math.max(ms,cs);
                    cs=nums[i];
                }
            }
            ms=Math.max(ms,cs);
            return ms;
        }
    }
}

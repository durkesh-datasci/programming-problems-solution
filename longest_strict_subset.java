class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ic=1,dc=1,max=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                ic++;
                dc=1;
            }else if(nums[i]>nums[i+1]){
                dc++;
                ic=1;
            }else{
                ic=1;
                dc=1;
            }
            max=Math.max(max,Math.max(ic,dc));
        }
        return max;
    }
}
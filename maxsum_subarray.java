class Maxsum {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int ms=nums[0];
        for(int numb:nums){
            cs+=numb;
            ms=Math.max(ms,cs);
            if (cs<0){
                cs=0;
            }
        }
        return ms;
    }
}
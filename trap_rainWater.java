public class trap_rainWater {
    class Solution {
        public int trap(int[] height) {
            int left=0,right=height.length-1;
            int lm=0,rm=0,total=0;
            while(left<right){
                lm=Math.max(lm,height[left]);
                rm=Math.max(rm,height[right]);
                if(lm<rm){
                    total+=lm-height[left];
                    left++;
                }else{
                    total+=rm-height[right];
                    right--;
                }
            }
            return total;
        }
    }
}

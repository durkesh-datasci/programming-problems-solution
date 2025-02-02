public class check_array_sorted {
    public static boolean check(int[] nums) {
            int n=nums.length;
            int dp=0;
            for(int i=0;i<n;i++){
                if(nums[i]>nums[(i+1)%n]){
                    dp+=1;
                }
                if(dp>1){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[]args){
            //example, main class
            int [] nums={3,4,5,1,2};
            check(nums);
    }
}

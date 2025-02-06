public class common_longest_string{
    public static void main(String []args){
        String s1="daylight",s2="daynight";//change your input here!
        int row=s1.length(),ml=0;
        int col=s2.length(),ri=0;
        int [][]dp=new int[row+1][col+1];
        dp[0][0]=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                dp[i][j]=0;
            }
        }

        for(int r=1;r<=row;r++){
            for(int c=1;c<=col;c++){
                if(s1.charAt(r-1)==s2.charAt(c-1)){
                    dp[r][c]=dp[r-1][c-1]+1;
                    if (dp[r][c] > ml) {
                        ml= dp[r][c];
                        ri=r;
                    }
                    
                }else{
                    dp[r][c]=0;
                }
            }
        }
        System.out.println(ml);
        System.out.println(s1.substring(ri - ml, ri));
        
    }
}
import java.util.*;
public class diamond_pattern{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<2*n;i++){
            int tc=i>n?2*n-i:i;
            int ns=n-tc;
            for(int s=0;s<ns;s++){
                System.out.print(" ");
            }
            for(int j=0;j<tc;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
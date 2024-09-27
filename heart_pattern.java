import java.util.*;
//it works better and superb, when n=5
//n=5, you get superb heart shape pattern(recommended)

public class heart_pattern{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int st=n/2;
        for(int i=st+1;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            for(int s=0;s<(2*(n-i));s++){
                System.out.print(" ");
            }
            
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2*n-1;i>=0;i--){
            if(i%2==1){
                for(int j=0;j<2*n-i;j++){
                    System.out.print(" ");
                }
                for(int k=i;k>0;k--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

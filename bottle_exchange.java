import java.util.*;
public class bottle_exchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //N-number of full water bottle, E- number of exchange to get one full bottle
        int N = sc.nextInt(), E = sc.nextInt();
        sc.close();

        System.out.println(N + (N - 1) / (E - 1));
    }
}
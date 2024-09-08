import java.util.*;

public class Main {
    static Integer[] dp = new Integer[1001];

    public static int fun(int n){
        if(dp[n] == null) {
            dp[n] = fun(n-1) + fun(n-2) + fun(n-3);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i=0; i<n; i++){
            System.out.println(fun(sc.nextInt()));
        }
    }
}
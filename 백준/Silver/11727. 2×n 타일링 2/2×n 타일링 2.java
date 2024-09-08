import java.util.*;

public class Main {
    static Long[] dp = new Long[1001];

    public static long fun(int n){
        if(dp[n] == null) {
            dp[n] = (fun(n-1) + 2*fun(n-2)) % 10007;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp[0] = (long) 1;
        dp[1] = (long) 1;

        long ans = fun(n);
        System.out.println(ans);
    }
}
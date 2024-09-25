import java.util.*;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i = 1; i <= m; i++) {
            int n = sc.nextInt();
            long[] dp = new long[n+1];

            dp[1] = 1;
            if(n >= 2) dp[2] = 1;
            if(n >= 3) dp[3] = 1;
            if(n >= 4) dp[4] = 2;
            if(n >= 5) dp[5] = 2;
            if(n >= 6) {
                for(int j=6; j<=n; j++) {
                    dp[j] = dp[j-1] + dp[j-5];
                }
            }

            System.out.println(dp[n]);
        }

    }
}
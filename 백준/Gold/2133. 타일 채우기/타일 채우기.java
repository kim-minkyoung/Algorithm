import java.util.*;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 0;
        if(n >= 2) dp[2] = 3;
        if(n > 2){
            for (int i = 3; i <= n; i++) {
                if (i % 2 != 0) dp[i] = 0;
                else {
                    dp[i] = dp[i - 2] * 3;
                    for (int j=0; j<=i-4; j+=2){
                        dp[i] += 2*dp[j];
                    }
                }
            }
        }

        System.out.println(dp[n]);
    }
}
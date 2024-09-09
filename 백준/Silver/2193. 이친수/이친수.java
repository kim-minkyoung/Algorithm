import java.util.*;

public class Main {

    static long[][] dp = new long[91][2];

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp[1][1] = 1;
        dp[2][0] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) dp[i][0] = Arrays.stream(dp[i-1]).sum();
                else dp[i][1] = dp[i-1][0];
            }
        }
        System.out.println(Arrays.stream(dp[n]).sum());
    }
}
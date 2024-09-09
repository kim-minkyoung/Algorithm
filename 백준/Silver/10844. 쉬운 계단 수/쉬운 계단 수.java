import java.util.*;

public class Main {
    static long[][] dp = new long[101][10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp[1][0] = 0;
        for(int i=1; i<10; i++) dp[1][i] = 1;

        for(int i=2; i<=n; i++){
            for(int j=0; j<10; j++){
                if(j==0) dp[i][j] = dp[i-1][1] % 1000000000;
                else if(j==9) dp[i][j] = dp[i-1][8] % 1000000000;
                else dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
            }
        }

        System.out.println(Arrays.stream(dp[n]).sum() % 1000000000);
    }
}
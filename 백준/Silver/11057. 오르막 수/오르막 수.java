import java.util.*;

public class Main {
    static long[][] dp = new long[1001][10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<10; i++) dp[1][i] = 1;

        for(int i=1; i<=n; i++) {
            for(int j=0; j<10; j++){
                for(int k=0; k<=j; k++){
                    dp[i][j] += dp[i-1][k] % 10007;
                }
            }
        }

        System.out.println(Arrays.stream(dp[n]).sum() % 10007);
    }
}
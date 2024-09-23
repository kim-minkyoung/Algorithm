import java.util.*;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];

        dp[1] = 1;
        for(int i=1; i<=n; i++) {
            dp[i] = i;
        }
        for (int i=1; i<=n; i++) {
            int root = (int) Math.sqrt(i);
            for (int j=1; j<=root; j++) {
                int base = i - (int) Math.pow(j, 2);
                dp[i] = Math.min(dp[i], dp[base]+1);
            }
        }
        System.out.println(dp[n]);
    }
}
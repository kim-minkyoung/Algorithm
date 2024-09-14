import java.util.*;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int row = sc.nextInt();
            int[][] dp = new int[2][row+2];
            int[][] stickers = new int[2][row+2];

            for(int j=0; j<2; j++) {
                for (int k = 1; k < row + 1; k++) {
                    dp[j][k] = sc.nextInt();
                    stickers[j][k] = dp[j][k];
                }
            }

            dp[0][1] = stickers[0][1];
            dp[1][1] = stickers[1][1];

            for(int j=2; j<row+1; j++) {
                dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + stickers[0][j];
                dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + stickers[1][j];
            }

            System.out.println(Math.max(dp[0][row], dp[1][row]));
        }
    }
}
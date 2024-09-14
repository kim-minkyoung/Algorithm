import java.util.*;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+3];
        int[] dp = new int[n+3];
        for(int i=0; i<3; i++){
            arr[i] = 0;
            dp[i] = 0;
        }
        for(int i=3; i<n+3; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=3; i<n+3; i++){
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-3] + arr[i-1] + arr[i], dp[i-2] + arr[i]));
        }
        System.out.println(dp[n+2]);
    }
}
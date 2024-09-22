import java.util.*;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] dp = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        dp[0] = nums[0];
        if(n > 1) {
            dp[1] = nums[0] + nums[1];
        }
        if(n > 2) {
            dp[2] = Math.max(nums[0] + nums[2], nums[1] + nums[2]);
        }

        for(int i = 3; i < n; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], nums[i] + nums[i - 1] + dp[i - 3]);
        }

        System.out.println(dp[n - 1]);
    }
}

import java.util.*;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] dp = new int[n];

        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.fill(dp, 1);

        for(int i=1; i<n; i++) {
            for(int j=0; j<i; j++) {
                if (nums[j] > nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
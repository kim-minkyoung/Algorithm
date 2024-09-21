import java.util.*;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] dp = new int[n];

        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
            dp[i] = nums[i];
        }

        for(int i=1; i<n; i++) {
            int max = 0;
            for(int j=0; j<i; j++){
                if(nums[j] < nums[i]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] += max;
        }

//        System.out.println(Arrays.toString(dp));
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
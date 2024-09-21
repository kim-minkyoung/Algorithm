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

        for(int i=0; i<n; i++) {
            if(i>0){
                dp[i] = Math.max(dp[i], dp[i]+dp[i-1]);
            }
//            System.out.println(Arrays.toString(dp));
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
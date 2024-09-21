import java.util.*;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.fill(dp1, 1);
        Arrays.fill(dp2, 1);

        for(int i=1; i<n; i++) {
            for(int j=0; j<i; j++){
                if(nums[j] < nums[i]) {
                    dp1[i] = Math.max(dp1[i], dp1[j]+1);
                }
            }
        }
        for(int i=n-2; i>=0; i--) {
            for(int j=n-1; j>i; j--) {
                if(nums[j] < nums[i]) {
                    dp2[i] = Math.max(dp2[i], dp2[j]+1);
                }
            }
        }

//        System.out.println(Arrays.toString(dp1));
//        System.out.println(Arrays.toString(dp2));
        int ans = 0;
        for(int i=0; i<n; i++) {
            ans = Math.max(ans, dp1[i]+dp2[i]-1);
        }
        System.out.println(ans);
    }
}
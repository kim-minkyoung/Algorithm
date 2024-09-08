import java.util.*;

public class Main {
    static Integer[] dp = new Integer[1000001];

    public static int fun(int n){
        int one = 1000001, two = 1000001, three = 1000001;
        if(dp[n] == null){
            if(n % 3 == 0) three = 1 + fun(n/3);
            if (n % 2 == 0) two = 1 + fun(n/2);
            one = 1 + fun(n - 1);

            int temp = Math.min(one, two);
            dp[n] = Math.min(temp, three);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        int ans = fun(n);
        System.out.println(ans);
    }
}
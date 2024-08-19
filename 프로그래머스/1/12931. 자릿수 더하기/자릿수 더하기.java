import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        int i = 10;
        while(n>0){
            ans += n % i;
            n /= 10;
        }
        return ans;
    }
}
import java.util.*;

class Solution {
    public long solution(long n) {
        ArrayList<Long> arr = new ArrayList<>();
        long ans = 0;
        while(n>0){
            arr.add(n%10);
            n /= 10;
        }
        while (arr.size() > 0) {
            ans += Collections.max(arr);
            arr.remove(Collections.max(arr));
            ans *= 10;
        }
        return ans / 10;
    }
}
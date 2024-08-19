import java.util.*;

class Solution {
    public int solution(int n) {
        int sum = 0;
        int sqrt = (int) Math.sqrt(n);
        for(int i=1; i<=sqrt; i++) {
            if(n%i == 0) {
                if(i!=n/i){
                    sum += i + n/i;
                }
                else{
                    sum += i;
                }
            }
        }
        return sum;
    }
}
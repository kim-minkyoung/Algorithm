import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;
        Arrays.sort(d);

        for(int i=0; i<d.length; i++){
            if (sum+d[i]<=budget){
                sum += d[i];
            }
            else return i;
        }

        return d.length;
    }
}
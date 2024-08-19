import java.util.*;

class Solution {
    public ArrayList<Long> solution(int x, int n) {
        ArrayList<Long> arr = new ArrayList<>();
        for(long i=1; i<n+1; i++) {
            arr.add(i*x);
        }
        return arr;
    }
}
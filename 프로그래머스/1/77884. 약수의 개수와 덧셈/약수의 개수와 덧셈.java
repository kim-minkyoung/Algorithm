import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            var root = Math.sqrt(i);
            if(root == (int) root) answer -= i;
            else answer += i;
        }
        return answer;
    }
}
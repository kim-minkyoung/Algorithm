import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int lastPainted = 0;  // 마지막으로 페인트를 칠한 위치를 기록합니다.
        
        for (int i = 0; i < section.length; i++) {
            if (section[i] > lastPainted) {
                answer++;  // 새로운 페인트칠 필요
                lastPainted = section[i] + m - 1;  // 롤러의 길이만큼 앞으로 칠합니다.
            }
        }
        
        return answer;
    }
}

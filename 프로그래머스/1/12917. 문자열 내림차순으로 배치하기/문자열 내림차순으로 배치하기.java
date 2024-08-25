import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuffer answer = new StringBuffer();
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        for(int i=0; i<charArr.length; i++) answer.append(charArr[i]);
        return answer.reverse().toString();
    }
}
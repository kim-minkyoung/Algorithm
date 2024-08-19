class Solution {
    boolean solution(String s) {
        String lowerStr = s.toLowerCase();
        long pCnt = lowerStr.chars().filter(c -> c == 'p').count();
        long yCnt = lowerStr.chars().filter(c -> c == 'y').count();
        return pCnt==yCnt;
    }
}
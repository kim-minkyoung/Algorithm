class Solution {
    public String solution(String s) {
        int center = s.length() / 2;
        if (s.length() % 2 == 0){
            return s.substring(center-1, center+1);
        }
        return s.substring(center, center+1);
    }
}
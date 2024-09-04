class Solution {
    public long solution(long price, long money, int count) {
        long answer = 0;
        for(int i=1; i<=count; i++) answer += price*i;
        return money<=answer ? -1*(money-answer) : 0;
    }
}
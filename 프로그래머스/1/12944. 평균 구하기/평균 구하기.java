class Solution {
    public double solution(int[] arr) {
        double sum = 0.0;
        for(int num: arr){
            sum += num;
        }
        double ans = sum / arr.length;
        return ans;
    }
}
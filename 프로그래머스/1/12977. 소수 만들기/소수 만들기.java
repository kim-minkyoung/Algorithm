class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i=0; i<nums.length-2; i++){
            for (int j=i+1; j<nums.length-1; j++){
                for (int k=j+1; k<nums.length; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if (sum % 2 != 0) {
                        for (int l=3; l<sum; l+=2){
                            // System.out.printf("l = %d, sum = %d\n", l, sum);
                            if (sum % l == 0) break;
                            if (l == sum-2) answer += 1;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
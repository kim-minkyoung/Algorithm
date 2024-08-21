import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> pocket = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            if (!pocket.contains(nums[i]) && pocket.size()<nums.length/2) pocket.add(nums[i]);
        }
        return pocket.size();
    }
}
import java.util.*;

class Solution {
    public Set<Integer> solution(int[] numbers) {
        // numbers = new int[]{1,1,2,2,3};  // 올바른 배열 초기화 방식
        Set<Integer> answer = new TreeSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                answer.add(numbers[i]+numbers[j]);
            }
        }
        // answer.sort(Comparator.naturalOrder());
        // Set<Integer> ansSet = new HashSet<>(answer);
        return answer;
    }
}
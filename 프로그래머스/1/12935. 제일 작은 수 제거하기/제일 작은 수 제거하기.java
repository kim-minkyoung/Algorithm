import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        
        if(arr.length < 2) {
            list.add(-1);
            return list;
        }
        
        for(int num: arr) {
            list.add(num);
            answer.add(num);
        }
        list.sort(Comparator.naturalOrder());
        int smallest = list.get(0);
        answer.remove(Integer.valueOf(smallest));
        return answer;
    }
}
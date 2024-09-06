import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0, multiply = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(String[] row: clothes){
            map.put(row[1], map.getOrDefault(row[1], 0) + 1);
        }
        
        int combinations = 1;
        for (int count : map.values()) {
            // 각 종류에서 선택할 수 있는 의상 수 (해당 종류의 의상 수 + 1)
            // 이 부분을 간과함 :: "안 입는 경우의 수(+1)"를 넣고 다 곱하면 됨
            combinations *= (count + 1);  
        }
        // 최소 하나의 의상은 착용해야 하므로 1을 뺀다
        return combinations - 1;

    }
}
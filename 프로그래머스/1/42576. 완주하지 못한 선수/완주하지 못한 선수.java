import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>(participant.length);
        for(String par: participant) {
            if(map.containsKey(par)) map.replace(par, map.get(par)+1);
            else map.put(par, 1);
        }
        for(String com: completion){
            if(map.containsKey(com)) map.replace(com, map.get(com)-1);
            if(map.get(com)==0) map.remove(com);
        }
        Object[] remain = map.keySet().toArray();
        return remain[0].toString();
    }
}
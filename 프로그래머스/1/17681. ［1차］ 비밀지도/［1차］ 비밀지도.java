import java.util.*;

class Solution {
    public ArrayList<String> solution(int n, int[] arr1, int[] arr2) {
        ArrayList<String> answer = new ArrayList();
        String binAns = "";
        for(int i=1; i<n+1; i++){
            String bin1 = Integer.toBinaryString(arr1[i-1]);
            while(bin1.length() < n) bin1 = "0" + bin1;
            String bin2 = Integer.toBinaryString(arr2[i-1]);
            while(bin2.length() < n) bin2 = "0" + bin2;
            for(int j=0; j<n; j++){
               if(Character.toString(bin1.charAt(j)).equals("0") && Character.toString(bin2.charAt(j)).equals("0")) {
                   binAns += " ";
               }
                else binAns += "#";
            }
            answer.add(binAns.toString());
            binAns = "";
        }
        return answer;
    }
}
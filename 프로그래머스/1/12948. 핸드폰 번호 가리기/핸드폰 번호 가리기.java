class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int i=0;
        for(String num: phone_number.split("")){
            if(i>=phone_number.length()-4) answer += num;
            else answer += "*";
            i++;
        }
        return answer;
    }
}
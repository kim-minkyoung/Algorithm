import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String[] name, int[] yearning, String[][] photo) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> answerReturn = new ArrayList<>();
        for(int i=0; i<photo.length; i++){
            ArrayList<String> photoList = new ArrayList<>(Arrays.asList(photo[i]));
            answer.add(i, 0);
            for(int j=0; j<name.length; j++){
                if (photoList.contains(name[j])) answer.add(i, answer.get(i)+yearning[j]);
            }
        }
        for (int i=0; i<photo.length; i++){
            answerReturn.add(answer.get(i));
        }

        return answerReturn;
    }
}
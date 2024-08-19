import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {
        // int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            stack.push(arr[i]);
            if (i>=1 && i<=arr.length-1){
                if (arr[i-1] == arr[i]) stack.pop();
            }
        }
        return stack;
    }
}
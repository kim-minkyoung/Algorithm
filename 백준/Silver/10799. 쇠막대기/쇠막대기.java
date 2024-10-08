import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String inputStr = sc.nextLine();
        char[] inputChars = inputStr.toCharArray();
        int ans = 0;

        for(int i = 0; i < inputChars.length; i++){
            if(inputChars[i] == '('){
                stack.push(inputChars[i]);
            }
            else {
                stack.pop();
                if(inputChars[i-1] == '('){
                    ans += stack.size();
                }
                else ans += 1;
            }
        }
        System.out.println(ans);
    }
}

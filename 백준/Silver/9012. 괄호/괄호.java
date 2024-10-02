import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            Stack<Integer> stack = new Stack<>();
            String str = sc.next();
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j)=='(') {
                    stack.push(j);
                }
                else {
                    if(!stack.isEmpty()) {
                        stack.pop();
                    }
                    else {
                        stack.push(j);
                        break;
                    }
                };
            }
            if(stack.isEmpty()) {System.out.println("YES");}
            else {System.out.println("NO");}
        }
    }
}

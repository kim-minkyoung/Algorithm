import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++) {
            String task = sc.next();
            if (task.equals("push")){
                int num = sc.nextInt();
                stack.push(num);
            }
            else if (task.equals("pop")){
                System.out.println(stack.isEmpty() ? "-1" : stack.pop());
            }
            else if (task.equals("size")){
                System.out.println(stack.size());
            }
            else if (task.equals("empty")){
                System.out.println(stack.isEmpty() ? "1" : "0");
            }
            else {
                System.out.println(stack.isEmpty() ? "-1" : stack.peek());
            }
        }
    }
}

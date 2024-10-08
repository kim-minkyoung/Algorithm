import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        int last = 0;

        for(int i=0; i<n; i++) {
            String operation = sc.next();
//            System.out.println(operation);
            switch(operation) {
                case "push":
                    int value = sc.nextInt();
                    queue.add(value);
                    last = value;
                    break;
                case "pop":
                    if (queue.isEmpty()) System.out.println(-1);
                    else System.out.println(queue.remove());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    if (queue.isEmpty()) System.out.println(-1);
                    else System.out.println(queue.peek());
                    break;
                case "back":
                    if (queue.isEmpty()) System.out.println(-1);
                    else System.out.println(last);
                    break;
                default:
                    break;
            }
        }
    }
}

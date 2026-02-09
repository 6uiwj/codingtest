import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = readInt();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int nextPush = 1;

        for (int i = 0; i < n; i++) {
            int num = readInt();

            while (nextPush <= num) {
                stack.push(nextPush++);
                sb.append("+\n");
            }

            if (stack.peek() != num) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-\n");
        }

        System.out.println(sb.toString());
    }

    static int readInt() throws IOException {
        int out = 0;
        while(true) {
            int n = System.in.read();
            if(n <= 32) return out;
            else out = (out << 3) + (out << 1) + (n - '0');
        }
    }

}

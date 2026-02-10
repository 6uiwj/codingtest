import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;


public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        Queue<Integer> cards = new ArrayDeque<>();
        for(int i = 0; i < N; i++) {
            cards.add(i+1);
        }

        while(cards.size() > 1) {
                cards.poll();
                cards.add(cards.poll());
        }
        System.out.println(cards.peek());
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

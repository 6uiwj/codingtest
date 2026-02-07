import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int M = readInt();
        int N = readInt();
        boolean[] prime = new boolean[N+1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        StringBuilder sb = new StringBuilder();
        for(int i = 2; i*i <= N; i++) {
            if(prime[i]) {
                for(int j=i*i; j<=N; j+=i) {
                    prime[j] = false;
                }
            }
        }

        for(int i = M; i<=N; i++) {
            if(prime[i] == true) {
                sb.append(i).append("\n");
            }
        }


        System.out.println(sb);

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

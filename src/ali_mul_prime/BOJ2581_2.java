package ali_mul_prime;

import java.io.IOException;
import java.util.Arrays;

public class BOJ2581_2 {
    public static void main(String[] args) throws IOException {
        int m = readInt();
        int n = readInt();

        boolean[] p = new boolean[n + 1];
        Arrays.fill(p, true);
        p[0] = p[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (p[i]) {
                for (int j = i * i; j <= n; j += i) {
                    p[j] = false;
                }
            }
        }

        int sum = 0;
        int min = 10001;

        for (int i = m; i <= n; i++) {
            if (p[i]) {
                sum += i;
                if (min > i) min = i;
            }
        }
        System.out.println(sum == 0 ? -1 : sum + "\n" + min);
    }

    private static int readInt() throws IOException {
        int n = 0;
        boolean isNegative = false;

        while (true) {
            int k = System.in.read();
            if (k <= 32) return isNegative ? n * (-1) : n;
            else if (k == '-') isNegative = true;
            else n = (n << 3) + (n << 1) + (k - '0');
        }
    }
}

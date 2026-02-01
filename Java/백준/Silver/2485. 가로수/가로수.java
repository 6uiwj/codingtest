import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int n = readInt();

        int[] trees = new int[n];
        for (int i = 0; i < n; i++) {
            trees[i] = readInt();
        }

        // 간격들의 GCD 구하기
        int g = trees[1] - trees[0];
        for (int i = 2; i < n; i++) {
            g = gcd(g, trees[i] - trees[i - 1]);
        }

        int total = (trees[n - 1] - trees[0]) / g + 1;
        int answer = total - n;

        System.out.println(answer);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static int readInt() throws IOException {
        int out = 0;
        while (true) {
            int n = System.in.read();
            if (n <= 32) return out;
            out = (out << 3) + (out << 1) + (n - '0');
        }
    }
}

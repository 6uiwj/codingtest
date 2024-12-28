package ali_mul_prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5086_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String[] k = br.readLine().split(" ");
            int x = Integer.parseInt(k[0]);
            int y = Integer.parseInt(k[1]);

            if (x == 0 && y == 0) break;

            if (y % x == 0) sb.append("factor\n");
            else if (x % y == 0) sb.append("multiple\n");
            else sb.append("neither\n");
        }

        br.close();
        System.out.print(sb);
    }
}

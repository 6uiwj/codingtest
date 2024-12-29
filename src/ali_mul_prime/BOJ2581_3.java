package ali_mul_prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2581_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

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

}

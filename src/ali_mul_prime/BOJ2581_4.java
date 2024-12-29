package ali_mul_prime;

import java.io.IOException;
import java.util.Arrays;

public class BOJ2581_4 {
    public static void main(String[] args) throws IOException {
        int m = readInt();
        int n = readInt();
        int ans =0;
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2; i<Math.sqrt(n); i++) {
            for(int j = 2; j*i<=n; j++) {
                isPrime[i*j]=false;
            }
        }
        int min = 10001;

        for(int i=m; i<=n; i++) {
            if(isPrime[i]) {
                ans+=i;
                if(min>i) min=i;
          }
        }
        System.out.println(ans == 0 ? -1 : ans + "\n" + min);
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

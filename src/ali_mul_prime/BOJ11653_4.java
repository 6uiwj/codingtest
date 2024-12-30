package ali_mul_prime;

import java.io.IOException;

public class BOJ11653_4 {

        public static void main(String[] args) throws IOException {
            StringBuilder sb = new StringBuilder();
            int n = readInt();
            for(int i = 2; i*i<=n; i++) {
                while(n%i==0) {
                    sb.append(i+"\n");
                    n=n/i;
                }
            }
            if(n!=1) sb.append(n);
            System.out.println(sb);
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

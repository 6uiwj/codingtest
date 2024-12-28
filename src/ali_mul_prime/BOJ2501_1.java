package ali_mul_prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2501_1 {

        public static void main(String args[]) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input = br.readLine();

            StringTokenizer tokens = new StringTokenizer(input, " ");

            int N = Integer.parseInt(tokens.nextToken());
            int K = Integer.parseInt(tokens.nextToken());

            int result = 0;

            for(int i=1; i<N+1; i++) {

                if(N%i == 0) {

                    K--; //나누어떨어지면 k의 숫자를 하나씩 감소시킴

                    if(K==0) {

                        result = i;
                    }
                }
            }

            System.out.print(result);
        }

    private static int readInt() throws IOException {
        int r = 0;
        boolean isNegative = false;

        while(true) {
            int n = System.in.read();

            if(n<=32) return isNegative? r*(-1) : r;
            else if (n=='-') isNegative=true;
            else r = (r<<3) + (r<<1) + (n-'0');

        }

    }

}

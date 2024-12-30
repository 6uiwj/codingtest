package ali_mul_prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11653_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i=n/2; i>=2; i--) {
            if(n%i==0) {
                System.out.println(i);
                n=n/i;
            }
            if(n==1) break;
        }
    }
}

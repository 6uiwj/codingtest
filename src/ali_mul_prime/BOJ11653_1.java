package ali_mul_prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11653_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 2; i<=n; i++) {
            while(n%i==0) {
                n=n/i;
                sb.append(i+"\n");
            }
            if(n==1) break;
        }
        System.out.println(sb);
    }
}

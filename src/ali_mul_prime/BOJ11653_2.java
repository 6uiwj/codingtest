package ali_mul_prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11653_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); //72
        int i = 2;
        while(i*i<=n) {
            if(n%i==0) { //
                sb.append(i+"\n"); //2  2 2 3
                n=n/i;
            }
            if(n%i!=0) i++;
        }
        if(n!=1) sb.append(n);
        System.out.println(sb);
    }


}

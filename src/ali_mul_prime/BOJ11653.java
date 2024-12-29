package ali_mul_prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        boolean[] p = new boolean[n+1];
        Arrays.fill(p,true);
        p[0]=false;
        p[1]=false;

        for(int i =2; i*i<=n;i++) {
            for(int j=2; j*i<=n; j++) {
                p[i*j]=false;
            }
        }

        for(int i=2; i<p.length;i++) { //2, 3
            if(p[i] && n%i==0) {
                while(n%i==0) {
                    n=n/i;
                    sb.append(i+"\n");
                }
            }
        }
        System.out.println(sb);
    }
}

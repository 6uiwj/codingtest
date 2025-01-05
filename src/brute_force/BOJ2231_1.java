package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2231_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String v = br.readLine();
        br.close();
        int j = v.length();
        int n = Integer.parseInt(v);
        int a = 0;
        int sum = 0;
        int k = 0;
        for (int i = Math.max(n-9*j,1); i < n; i++) {
            sum = i;
            k = i;
            while (k>0) {
                sum += k%10;
                k /=10;
            }
            if(sum ==n) {
                a=i;
                break;
            }
        }
        System.out.println(a);
    }

}

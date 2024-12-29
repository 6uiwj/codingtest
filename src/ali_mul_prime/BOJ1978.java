package ali_mul_prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int ans =0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++) {
            int k = Integer.parseInt(st.nextToken());
            int temp = 0;
            for(int j=1; j<=k; j++) {
                if(k%j==0)  temp++;
            }
            if(temp==2) ans++;
        }
        System.out.println(ans);
    }
}

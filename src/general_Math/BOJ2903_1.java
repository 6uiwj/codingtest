package general_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2903_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 2;
        int d = 1;
        for(int i = 0; i<n; i++) {
            ans +=d;
            d=d<<1;
        }
        System.out.println(ans*ans);
    }
}

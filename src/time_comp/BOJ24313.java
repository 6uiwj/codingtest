package time_comp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t[] = br.readLine().split(" ");
        int a1 = Integer.parseInt(t[0]);
        int a0 = Integer.parseInt(t[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        int i = 1;
        int f = a1*i+a0;
        int g = i;
        int ans = 1;
        if(n0==1) {
            if(f<=c*g) {

            }
        }
        while(i<n0) {
            if (f <= c * g) ans *= 0;
            else ans *= 1;
            i++;
        }

        System.out.println(ans);
    }
}

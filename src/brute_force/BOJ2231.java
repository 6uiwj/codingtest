package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int ans = 0;
        int j = String.valueOf(n).length();
            for (int i = Math.max(n-9*j,1); i < n; i++) {
                ans = DigitSum(i);
                if(ans==n) {
                    a=i;
                    break;
                }
            }

        System.out.println(a);
    }

    private static int DigitSum (int num) {
        int ans = 0;
        int input = num;
        while (num>0) {
            ans += num%10;
            num /=10;
        }
            return ans+input;
        }
}

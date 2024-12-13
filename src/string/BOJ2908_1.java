package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        int num1 = 0;
        int num2 = 0;
        int digit = 1;

        for(int i = 0 ; i < 3 ; i++){
            num1 += Character.getNumericValue(a.charAt(i))*digit;
            num2 += Character.getNumericValue(b.charAt(i))*digit;
            digit *= 10;
        }

        int ans = num1 > num2 ? num1 : num2;
        System.out.println(ans);
    }
}

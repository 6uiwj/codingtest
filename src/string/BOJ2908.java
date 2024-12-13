package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        String a1 = "";
        String a2 = "";
        for(int i = 2; i>=0; i--) {
            a1 += a.charAt(i);
            a2 += b.charAt(i);
        }

        int num1 = Integer.parseInt(a1);
        int num2 = Integer.parseInt(a2);
        System.out.println(num1 + " "+num2);

        int ans = num1> num2 ? num1 : num2;
        System.out.println(ans);
    }
}

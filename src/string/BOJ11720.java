package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class BOJ11720 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        String num = br.readLine();
        for(int i = 0; i<num.length(); i++) {
            ans +=Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(ans);
    }
}

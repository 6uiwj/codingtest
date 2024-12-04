package iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        String b = "int";
        String c = "long";
        String ans = "";

        for(int i = 0; i<a/4; i++) {
            ans += c + " ";
        }
        System.out.println(ans+b);
    }
}

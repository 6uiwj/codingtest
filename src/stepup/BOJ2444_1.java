package stepup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2444_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = "";
        String star = "**";
        String b = "*";

        for(int i = 0; i<n; i++) {
            b+=" ";
        }
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(b);
        for(int i = 0; i<2*n-1; i++) { // 4 1 / 3 3 / 2 5 /1 7 / 0 9
            if(i<n) {
                sb2.deleteCharAt(sb2.length()-1);
                sb.append(star);
                System.out.println(sb2+""+sb);
            } else {
                sb2.append(' ');
                sb.delete(sb.length()-2,sb.length());
                System.out.println(sb2+""+sb);
            }
        }

    }
}

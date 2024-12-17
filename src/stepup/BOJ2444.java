package stepup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = "*";
        String b = "";

        for(int i = 0; i<n; i++) {
            b+=" ";
        }
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(b);
        for(int i = 0; i<2*n-1; i++) { // 4 1 / 3 3 / 2 5 /1 7 / 0 9
            if(i<n) { // i<5
                System.out.print(sb2.deleteCharAt(sb2.length()-1));
                System.out.println(sb);
                if(i==n-1) continue;
                sb.append("**");
            } else if(i<2*n-1){ //i = 5
                sb.delete(sb.length()-2,sb.length());
                System.out.print(sb2.append(' '));
                System.out.println(sb);

            }
        }

    }
}

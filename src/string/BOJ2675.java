package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i =0; i<t; i++) {
            String ans = "";
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken()); //3
            String s = st.nextToken(); //ABC

            for(int j=0; j<s.length(); j++) {
                for(int k=0; k<r; k++) {
                    ans += String.valueOf(s.charAt(j));
                }
            }
            System.out.println(ans);

        }
    }
}

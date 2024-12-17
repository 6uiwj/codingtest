package stepup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();
        int ans = 1;

        for(int i = 0; i<w.length()/2; i++) { //i=0  0,4  1/3
            if(w.charAt(i) != w.charAt(w.length()-i-1)) {ans*=0; break;}
            else ans *=1;
        }

        System.out.println(ans);
    }
}

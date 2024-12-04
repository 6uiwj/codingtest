package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] b = a.split(" ");
//        String b[] = br.readLine().split(" ");
       // long answer = 0;
        long d = Long.parseLong(b[0]);
        long e = Long.parseLong(b[1]);
        long f = Long.parseLong(b[2]);

        long answer = d+e+f;
//        for(int i = 0; i<b.length; i++) {
//            answer += Long.parseLong(b[i]);
//        }
        System.out.println(answer);
    }
}

package stepup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1157_1 {
    public static void main(String[] args) throws IOException {
        int c[] = new int[26];
        int a = System.in.read();
        int temp=0;


        for(int i = 0; i<26; i++) {
            if(a-65 == i) {
                c[i]++;
            }
        }

        int max=0;
        int index = -1;
        for(int i = 0; i<26; i++) {
            if(i>max) {
                max = c[i];
                index = i;
            }
        }
        for(int i =65; i<=90; i++) {
            if(c[i]==max) temp++;
        }
        System.out.println(temp > 1 ? "?" : String.valueOf((char)index).toUpperCase());

    }
}

package stepup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toUpperCase().toCharArray();
        int c[] = new int[91];
        int temp=0;


        for(int i = 65; i<=90; i++) {
            for(int j =0; j<a.length; j++) {
                if (a[j] == i) c[i]++;
            }
        }

        int max=0;
        int index = -1;
        for(int i = 65; i<=90; i++) {
            if(c[i]>max) {
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

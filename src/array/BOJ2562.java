package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[9];
        int index = 1;
        int max=0;

        for(int i = 0; i<a.length; i++) {
            a[i] =Integer.parseInt(br.readLine());
        }

        max=a[0];

        for(int i = 0; i<a.length; i++) {
            if(a[i]>max) {
                max=a[i];
                index=i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}

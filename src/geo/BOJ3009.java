package geo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] a = new int[6];
        for(int i = 0; i<a.length; i=i+2) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            a[i+1] = Integer.parseInt(st.nextToken());
        }

        if(a[0]==a[2]) sb.append(a[4]);
        else if(a[0]==a[4]) sb.append(a[2]);
        else sb.append(a[0]);
        sb.append(" ");
        if(a[1]==a[3]) sb.append(a[5]);
        else if (a[3]==a[5]) sb.append(a[1]);
        else sb.append(a[3]);

        System.out.println(sb);
    }
}

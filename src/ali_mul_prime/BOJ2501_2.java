package ali_mul_prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2501_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        StringBuilder sb= new StringBuilder();

        for(int i=0; i<x; i++) {
            if(x%(i+1)==0) {
                sb.append(i+1 + " ");
            }
        }
        String[] ans = sb.toString().split(" ");
        System.out.println(y > ans.length ? 0 : ans[y-1]);
    }
}

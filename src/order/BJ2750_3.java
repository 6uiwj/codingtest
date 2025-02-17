package order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2750_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] num = new boolean[2001];
        Arrays.fill(num,false);
        int temp = 10000;
        for(int i = 0; i < n; i++) {
            temp = Integer.parseInt(br.readLine());
            if(temp < 0) {
                temp = Math.abs(temp) + 1000;
                num[temp] = true;
            }
            else num[temp] = true;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = num.length-1; i >= 1001; i--) {
            if(num[i]) sb.append((-1)*(i-1000)+"\n");
        }

        for(int i = 0; i <= 1000; i++) {
            if(num[i]) sb.append(i+"\n");
        }
        System.out.println(sb);
    }

}

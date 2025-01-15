package order;

import java.io.IOException;
import java.util.Arrays;

public class BOJ2750_2 {
    public static void main(String[] args) throws IOException {
        int n = readInt();
        boolean[] num = new boolean[2001];
        Arrays.fill(num,false);
        int temp = 10000;
        for(int i = 0; i < n; i++) {
            temp = readInt();
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

    private static int readInt() throws IOException {
        int out = 0;
        boolean isNegative = false;

        while(true) {
            int n = System.in.read();
            if(n <= 32) return isNegative ? (-1)*out : out;
            else if(n == '-') isNegative = true;
            else out = (out<<3) + (out<<1) + (n-'0');
        }
    }
}

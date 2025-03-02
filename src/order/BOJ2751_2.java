package order;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BOJ2751_2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = readInt(bis);
        boolean[] sort = new boolean[2000001];

        for(int i = 0; i< n; i++) {
            int temp = readInt(bis);
            if(temp < 0) {
                temp = Math.abs(temp) + 1000000;
                sort[temp] = true;
            }
            else sort[temp] = true;        }

        StringBuilder sb = new StringBuilder();
        for(int i = sort.length-1; i >= 1000001; i--) {
            if(sort[i]) sb.append((-1)*(i-1000000)+"\n");
        }

        for(int i = 0; i <= 1000000; i++) {
            if(sort[i]) sb.append(i+"\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    private static int readInt(BufferedInputStream bis) throws IOException {
        int out = 0;
        boolean isNegative = false;

        while(true) {
            int n = bis.read();
            if(n <= 32) return isNegative ? (-1)*out : out;
            else if(n == '-') isNegative = true;
            else out = (out<<3) + (out<<1) + (n-'0');

        }
    }
}

package order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2750_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[2001];
        int temp = 10000;
        for(int i = 0; i < n; i++) {
            temp = Integer.parseInt(br.readLine()); //-928 //-956
            if(temp < 0) {
                temp = Math.abs(temp) + 1000;
                num[temp] = temp;
            } else if(temp == 0) num[0]=10000;
            else num[temp] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = num.length-1; i >= 1001; i--) {
            if(num[i] != 0) sb.append((-1)*(num[i]-1000)+"\n");
        }

        if(num[0] == 10000) sb.append("0\n");

        for(int i = 1; i <= 1000; i++) {
            if(num[i]!=0) sb.append(num[i]+"\n");
        }
        System.out.println(sb);
    }

//    private static int readInt() throws IOException {
//        int out = 0;
//        boolean isNegative = false;
//
//        while(true) {
//            int n = System.in.read();
//            if(n <= 32) return isNegative ? (-1)*out : out;
//            else if(n == '-') isNegative = true;
//            else out = (out<<3) + (out<<1) + (n-'0');
//
//        }
//    }
}

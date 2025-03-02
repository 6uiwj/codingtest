package order;

import java.io.IOException;
import java.util.Arrays;

public class BOJ2751 {
    public static void main (String[] args) throws IOException {
        int n = readInt(); //몇 개의 숫자를 입력받을 것인지?
        int[] orderArr = new int[n];
        for(int i = 0; i < n; i++) {
            orderArr[i] = readInt();
        }
        Arrays.sort(orderArr);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            sb.append(orderArr[i]+"\n");
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

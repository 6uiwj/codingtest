package brute_force;

import java.io.IOException;

public class BOJ19532_3 {
    public static void main(String[] args) throws IOException {
        int a = readInt(), b = readInt(), c = readInt();
        int d = readInt(), e = readInt(), f = readInt();
        int n = a * e - b * d;

        int x = (c * e - b * f) / n;
        int y = (a * f - c * d) / n;
        System.out.println(x + " " + y);
    }
    
    private static int readInt() throws IOException {
        int out = 0;
        boolean isNegative = false;

        while(true) {
            int n = System.in.read();
            if(n<=32) return isNegative? out*(-1): out;
            else if(n=='-') isNegative=true;
            else out = (out<<3) + (out<<1) + (n-'0');
        }
    }
}

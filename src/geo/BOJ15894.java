package geo;

import java.io.IOException;

public class BOJ15894 {
    public static void main(String[] args) throws IOException {
        long n =readLong();
        System.out.println(n*4);
    }

    private static long readLong() throws IOException {
        long r = 0;
        boolean isNegative = false;

        while(true) {
            long n = System.in.read();

            if(n<=32) return r;
            else if (n=='-') isNegative=true;
            else r = (r<<3) + (r<<1) + (n-'0');

        }

    }
}

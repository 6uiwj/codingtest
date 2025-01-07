package brute_force;

import java.io.IOException;

public class BOJ19532 {
    public static void main(String[] args) throws IOException {
        int a = readInt();
        int b = readInt();
        int c = readInt();
        int d = readInt();
        int e = readInt();
        int f = readInt();
        int x = 0;
        int y = 0;
         if (a == 0) {
            y = c / b;
            x = (f - e * y) / d;
        } else if (b == 0) {
            x = c / a;
            y = (f - d * x) / e;

        } else if (d == 0) {
            y = f / e;
            x = (c - b * y) / a;
        } else if (e == 0) {
            x = f / d;
            y = (c - a * x) / b;
        } else {
            int g = lmc(a, d);
            int t1 = g / a;
            int t2 = g / d;
            int a1 = 0;
            int a2 = 0;
            int a3 = 0;
            b *= t1;
            c *= t1;
            e *= t2;
            f *= t2;
            a2 = b - e;
            a3 = c - f;
            y = a3 / a2;
            x = (c - b * y) / g;
        }
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

    private static int lmc(int x, int y) {
        int max = Math.min(x,y);
        int xd = 1;
        for(int i = 2; i<=max; i++) {
            while(x%i==0 && y%i==0) {
                xd *= i;
                x /= i;
                y /= i;
            }
        }
        xd = xd*x*y;
        return xd;
    }
}

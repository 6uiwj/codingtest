package geo;

import java.io.IOException;

public class BOJ10101 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int x =0; int y=0; int z =0;
        while(true) {
            x = readInt();
            if(x==0) break;
            y = readInt();
            z = readInt();
            int sum = x+y+z;
            int max = Math.max(x,Math.max(y,z));

            if(max >= sum-max ) sb.append("Invalid\n");
            else {
                if (x == y && y == z) sb.append("Equilateral\n");
                else if (x == y || y == z || z == x) sb.append("Isosceles\n");
                else sb.append("Scalene\n");
            }
        }
        System.out.println(sb);
    }

    private static int readInt() throws IOException {
        int r = 0;
        while(true) {
            int n = System.in.read();
            if(n<=32) return r;
            else r = (r<<3) + (r<<1) + (n-'0');
        }
    }
}

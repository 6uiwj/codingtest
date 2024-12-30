package geo;

import java.io.IOException;

public class BOJ3009_1 {
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        int x1 = readInt(); int y1 = readInt();
        int x2 = readInt(); int y2 = readInt();
        int x3 = readInt(); int y3 = readInt();

        if(x1==x2) sb.append(x3);
        else if(x1==x3) sb.append(x2);
        else sb.append(x1);
        sb.append(" ");
        if(y1==y2) sb.append(y3);
        else if (y1==y3) sb.append(y2);
        else sb.append(y1);

        System.out.println(sb);
    }

    private static int readInt() throws IOException {
        int r = 0;
        boolean isNegative = false;

        while(true) {
            int n = System.in.read();

            if(n<=32) return isNegative? r*(-1) : r;
            else if (n=='-') isNegative=true;
            else r = (r<<3) + (r<<1) + (n-'0');

        }

    }
}

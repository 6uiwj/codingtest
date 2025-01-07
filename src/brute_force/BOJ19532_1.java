package brute_force;

import java.io.IOException;

public class BOJ19532_1 {
    public static void main(String[] args) throws IOException {
        int a = readInt(); int b = readInt(); int c = readInt(); //8
        int d = readInt(); int e = readInt(); int f = readInt(); //6
    for(int i=-999; i<=999; i++) {
        for(int j=-999; j<=999; j++) {
            if(a*i+b*j==c) {
                if(d*i+e*j==f) {
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }

    }
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

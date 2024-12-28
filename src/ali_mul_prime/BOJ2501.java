package ali_mul_prime;

import java.io.IOException;

public class BOJ2501 {
    public static void main(String[] args) throws IOException{
        int x = readInt();
        int y = readInt();
        StringBuilder sb= new StringBuilder();

        for(int i=0; i<x; i++) {
            if(x%(i+1)==0) sb.append(i+1 + " ");
        }
        String[] ans = sb.toString().split(" ");
        System.out.println(y > ans.length ? 0 : ans[y-1]);
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

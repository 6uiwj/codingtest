package ali_mul_prime;

import java.io.IOException;

public class BOJ1978_1 {
    public static void main(String[] args) throws IOException {

        int n = readInt();
        int ans =0;

        for(int i = 0; i<n; i++) {
            int k = readInt();
            int temp = 0;
            for(int j=1; j<=k; j++) {
                if(k%j==0)  temp++;
            }
            if(temp==2) ans++;
        }
        System.out.println(ans);
    }

    private static int readInt() throws IOException {
        int n = 0;
        boolean isNegative = false;

        while(true) {
            int k = System.in.read();

            if (k<=32) return isNegative ? n*(-1) : n;
            else if (k=='-') isNegative=true;
            else n = (n<<3) + (n<<1) + (k-'0');
        }
    }
}

package order;

import java.io.IOException;

public class BOJ2750 {
    public static void main(String[] args) throws IOException{
        int n = readInt();
        int[] num = new int[n];
        for(int i = 0; i<n; i++) {
            num[i] = readInt();
        }

        for(int i=0; i<n-1; i++) { //52341  //0
            for(int j =i+1; j<n; j++) {
                if(num[i]>num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(int ans : num) {
            System.out.println(ans);
        }
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
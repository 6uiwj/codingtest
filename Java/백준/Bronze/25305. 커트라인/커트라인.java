import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int k = readInt();
        int[] score = new int[N];
        for(int i = 0; i<N; i++) {
            score[i] = readInt();
        }
        Arrays.sort(score);
        
        System.out.println(score[N-k]);
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

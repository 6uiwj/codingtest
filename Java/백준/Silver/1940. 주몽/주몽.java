import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int M = readInt();
        int[] A = new int[N];
        for(int i = 0; i< N; i++) {
            A[i] = readInt();
        }
        Arrays.sort(A);
        int count = 0;
        int i = 0;
        int j = N-1;
        while( i < j ) {
            if( A[i] + A[j] < M ) i++;
            else if ( A[i] + A[j] > M) j--;
            else {
                count ++;
                i++;
                j--;
            }
        }
        System.out.println(count);

    }
    static int readInt() throws IOException {
        int out = 0;
        while(true) {
            int n = System.in.read();
            if( n <= 32) return out;
            else out = (out << 3) + (out << 1) + (n - '0');
        }
    }
}

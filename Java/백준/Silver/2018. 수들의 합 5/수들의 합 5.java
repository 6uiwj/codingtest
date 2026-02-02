import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        int count = 1;
        
        while(end_index != N) {
            if(sum == N) {
                count++;
                end_index++;
                sum += end_index;
            } else if (sum > N) {
                sum -= start_index;
                start_index++;
            } else {
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);
    }

    static int readInt() throws IOException {
        int out = 0;
        while(true) {
            int n = System.in.read();
            if( n <= 32 ) return out;
            else out = (out << 3)  + (out << 1) + ( n - '0');
        }
    }
}

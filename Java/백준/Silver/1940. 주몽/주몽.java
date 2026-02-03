import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt(); 
        int M = readInt(); 
        int count = 0;
        int[] nums = new int[N];
        for(int i =0; i<N; i++) {
            nums[i] = readInt();
        }

        int i = 0;
        int j = 1;
        while(i<N-1) {
            if(j>=N) {
                i++;
                j=i+1;
                continue;
            }
            if(nums[i] + nums[j] == M) {
                nums[i]=-100000;
                nums[j]=-100000;
                count++;
                i++;
                j=i+1;
                continue;
            }
            j++;

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

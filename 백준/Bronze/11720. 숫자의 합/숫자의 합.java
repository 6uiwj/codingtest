
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int count = readInt();
        int out = 0;
        int answer = 0;
        while(true) {
            int n = System.in.read();
            if(n <= 32) {
                break;
            }
            else answer += n-'0';
        }
        System.out.println(answer);
        
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
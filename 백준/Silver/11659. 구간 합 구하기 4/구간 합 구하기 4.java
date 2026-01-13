
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        int n = readInt(); 
        int m = readInt(); 
        int[] arr = new int[n]; 
        int temp = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){ 
            temp += readInt();
            arr[i] = temp;
        }

        for(int j=0; j<m; j++){ 
            int a = readInt();
            int b = readInt();
            if(a == 1) {
                sb.append(arr[b-1]);
            } else {
                sb.append(arr[b - 1] - arr[a - 2]);
            }
           sb.append('\n');
        }

        System.out.println(sb.toString());

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

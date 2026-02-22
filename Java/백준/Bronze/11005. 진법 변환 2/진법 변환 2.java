import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]); 
        int b = Integer.parseInt(in[1]);
        String result = "";
        int temp = 0;

        while(n>0) {
            temp = n%b; 
            sb.append(temp > 9 ? (char)(temp+55) : (char)(temp+'0'));
            n/=b;
        }
        System.out.println(sb.reverse());
    }
}

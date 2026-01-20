
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int m = readInt();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> strings = new HashSet<>();
        int count = 0;
        for(int i = 0; i < n; i++){
            strings.add(br.readLine());
        }

        for(int i = 0; i < m; i++){
            String s = br.readLine();
            if(strings.contains(s)){
                count++;
            }
        }
        System.out.println(count);
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

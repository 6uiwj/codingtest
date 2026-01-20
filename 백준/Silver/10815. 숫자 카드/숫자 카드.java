
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        int n = readInt();
        Set<Integer> sets = new HashSet<Integer>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sets.add(readInt());
        }

        int m = readInt();
        int num = 0;
        for(int i = 0; i < m; i++){
            num = readInt();
            if(sets.contains(num)) {
                sb.append("1").append(" ");
            } else sb.append("0").append(" ");
        }

        System.out.println(sb);
    }

    public static int readInt() throws IOException {
        int out = 0;
        boolean isNegative = false;

        while (true) {
            int n = System.in.read();
            if ( n <= 32 ) return isNegative ? -1*(out) : out;
            else if (n == '-') {
                isNegative = true;
            }
            else {
                out = (out << 3) + (out << 1) + (n-'0');
            }
        }

    }

}


import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        int n = readInt();
        int[] coords = new int[n];

        for(int i = 0; i < n; i++){
            coords[i] = readInt();
        }

        int[] result = Arrays.stream(coords).distinct().sorted().toArray();

        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < result.length; i++) {
            indexMap.put(result[i], i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(indexMap.get(coords[i])).append(" ");
        }

        System.out.println(sb);
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

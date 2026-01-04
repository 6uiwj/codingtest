import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = readInt();
        int[][] coords = new int[n][2];

        for (int i = 0; i < n; i++) {
            coords[i][0] = readInt();
            coords[i][1] = readInt();
        }

        Arrays.sort(coords, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });
        for (int i = 0; i < coords.length; i++) {
            sb.append(coords[i][0]).append(" ").append(coords[i][1]).append("\n");
        }
        System.out.print(sb);
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

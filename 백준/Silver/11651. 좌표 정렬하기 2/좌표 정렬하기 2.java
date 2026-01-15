import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[][] coords = new int[n][2];
        for(int i = 0; i < n; i++){
            coords[i][0] = readInt();
            coords[i][1] = readInt();

        }
        Arrays.sort(coords, (a,b)->
            {
                if (a[1] != b[1]) {
                    return Integer.compare(a[1], b[1]);
                }
                return Integer.compare(a[0], b[0]);
            });

        for(int[] row : coords){
            System.out.println(row[0] + " " + row[1]);
        }
        

    }

    private static int readInt() throws IOException {
        int out = 0;
        boolean negative = false;

        while (true) {
            int n = System.in.read();
            if(n<=32) return negative? (-1)*out:out;
            else if (n == '-') negative = true;
            else out = (out <<3) + (out<<1) + (n-'0');
        }

    }

}

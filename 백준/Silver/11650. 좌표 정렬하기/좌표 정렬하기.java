import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] coords = new int[n][2];

        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            String[] coord = temp.split(" ");
            coords[i][0] = Integer.parseInt(coord[0]);
            coords[i][1] = Integer.parseInt(coord[1]);
        }
        Arrays.sort(coords, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });
        
        for(int i = 0; i < n; i++){
            System.out.println(coords[i][0] + " " + coords[i][1]);;
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] area = new int[100][100];
        int ans = 0;
        for (int i =0; i<n; i++) {
            String[] sq = br.readLine().split(" ");
            int x = Integer.parseInt(sq[0]);
            int y = Integer.parseInt(sq[1]);
           for(int l =x; l<x+10; l++) {
               for(int m=y; m<y+10; m++) {
                   area[l][m]=1;
                    }
                }
            }
        for(int i = 0; i<100; i++) {
            for(int j = 0; j<100; j++) {
                if(area[i][j]==1) ans++;
            }
        }
        System.out.println(ans);
    }
}

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); 
        int m = Integer.parseInt(input[1]); 
        String[][] chess = new String[n][m];

        for(int i=0; i<n; i++) {
            String line = br.readLine();
            for(int j=0; j<m; j++) {
                chess[i][j] = String.valueOf(line.charAt(j));
            }
        }
        
        int x = 0;
        int min = n*m;
        for(int l=0; l<=n-8; l++) {
            int y = 0;
            for (int k = 0; k <= m - 8; k++) {
                int count =0;
                for (int i = x; i < x + 8; i++) {
                    for (int j = y; j < y + 8; j++) {
                        if((i+j)%2==0 && chess[i][j].equals("B")) count++;
                        if((i+j)%2==1 && chess[i][j].equals("W")) count++;
                    }
                }
                if(count<min) min=count;
                y++;
            }
            x++;
        }
        
        x=0;
        for(int l=0; l<=n-8; l++) {
            int y = 0;
            for (int k = 0; k <= m - 8; k++) {
                int count =0;
                for (int i = x; i < x + 8; i++) {
                    for (int j = y; j < y + 8; j++) {
                        if((i+j)%2==0 && chess[i][j].equals("W")) count++;
                        if((i+j)%2==1 && chess[i][j].equals("B")) count++;
                    }
                }
                if(count<min) min=count;
                y++;
            }
            x++;
        }
        System.out.println(min);
    }
}

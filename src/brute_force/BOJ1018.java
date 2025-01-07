package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); //행의 수
        int m = Integer.parseInt(input[1]); //열의 수
        String[][] chess = new String[n][m];


        for(int i=0; i<n; i++) {
            String line = br.readLine();
            for(int j=0; j<m; j++) {
                chess[i][j] = String.valueOf(line.charAt(j));
            }
        }

//        for(int i=0; i<8; i++) {
//            for(int j=0; j<8; j++) {
//                if((i+j)%2==0) {
//                    ans1[i][j] = "B";
//                    ans2[i][j] = "W";
//                }
//                else {
//                    ans1[i][j]="W";
//                    ans2[i][j]="B";
//                }
//            }
//        }

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

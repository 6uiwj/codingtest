package _2dim_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dim = br.readLine().split(" ");
        int x = Integer.parseInt(dim[0]);
        int y = Integer.parseInt(dim[1]);
        int[][] arr1 = new int[x][y];

        for(int k = 0; k<2; k++) {
            for (int i = 0; i < x; i++) {
                String[] r = br.readLine().split(" ");
                for (int j = 0; j < y; j++) {
                    arr1[i][j] += Integer.parseInt(r[j]);
                }
            }
        }



        StringBuilder sb = new StringBuilder();
        for(int i =0; i<x; i++) {
            for(int j =0; j<y; j++) {
                sb.append(arr1[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}

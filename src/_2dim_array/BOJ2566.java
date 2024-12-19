package _2dim_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BOJ2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[];
        int max = -1;
        int[][] arr =  new int[9][9];
        int[] xy = new int[2];
        for(int i = 0; i<9; i++) {
            a = br.readLine().split(" ");
            for(int j = 0; j<9; j++) {
                arr[i][j] = Integer.parseInt(a[j]);
                if(arr[i][j]>max) {
                    max=arr[i][j];
                    xy[0]= i+1;
                    xy[1]= j+1;
                }
                }
            }
        System.out.println(max);
        System.out.println(xy[0]+" "+xy[1]);
        }
    }


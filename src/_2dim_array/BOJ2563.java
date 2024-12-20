package _2dim_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][2];
        int a = 100;
        int b = 100;
        int area = 0;
        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(temp[j]);
            }
        }
        for (int i = 0; i < n; i++) { //3
            for (int j = i+1; j < n; j++) {
                int x = arr[i][0] - arr[j][0];
                int y = arr[i][1] - arr[j][1];
                if (Math.abs(x) < 10 && Math.abs(y) < 10) {
                    area += (10-Math.abs(x)) * (10-Math.abs(y));
                }
            }
        }
        System.out.println(100*n - area);
    }

    static int[] order (int a, int b, int c) {
        int[] or = new int[3];
        int temp1 = Math.max(a, b);
        int temp2 = Math.min(a, b);
        if (temp1 > c) {
            or[2] = temp1;
            if (temp2 > c) {
                or[0] = c;
                or[1] = temp2;
            } else {
                or[0] = temp2;
                or[1] = c;
            }
        } else {
            or[2] = c; //2번확정
            or[1] = temp1;
            or[0] = temp2;
        }
        return or;
    }
}

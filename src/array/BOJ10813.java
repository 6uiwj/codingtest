package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int busket[] = new int[n];
        for(int k = 0; k<n; k++) {
            busket[k] = k+1;
        }

        for(int k = 0; k<m; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            int temp=0;
            temp = busket[j];
            busket[j] = busket[i];
            busket[i] = temp;

        }

        for(int ans : busket) {
            System.out.print(ans+" ");
        }

    }
}

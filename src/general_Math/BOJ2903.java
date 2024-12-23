package general_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int temp = 2;
        int ans = 4;
        int m = 1;
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++) { //2 3 5 9 17 33
            temp += m;
            ans = temp*temp;
            m *=2;
        }
        System.out.println(ans);
    }
}

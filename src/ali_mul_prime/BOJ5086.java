package ali_mul_prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String c= "";
        StringBuilder sb = new StringBuilder();
        while((c=br.readLine()) != null) {
            StringTokenizer st= new StringTokenizer(c," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x==0&&y==0) break;
            if (y % x == 0) sb.append("factor\n");
            else if (x % y == 0) sb.append("multiple\n");
            else sb.append("neither\n");
        }
        br.close();
        System.out.println(sb);
    }

}

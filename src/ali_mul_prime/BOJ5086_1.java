package ali_mul_prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5086_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String c= "";
        StringBuilder sb = new StringBuilder();
        int x = 0; int y = 0;
        do {
            c= br.readLine();
            StringTokenizer st= new StringTokenizer(c," ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if(x==0&&y==0) break;
            if (y % x == 0) sb.append("factor\n");
            else if (x % y == 0) sb.append("multiple\n");
            else sb.append("neither\n");
        }
        while(x!=0&&y!=0);

        br.close();
        System.out.println(sb);
    }
}


package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ1247_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int j=0; j<3; j++) {
            int n = Integer.parseInt(br.readLine());
            BigInteger x = BigInteger.ZERO;
            for (int i = 0; i < n; i++) {
                x = x.add(BigInteger.valueOf(Long.parseLong(br.readLine())));
            }
            if (x.doubleValue() > 0) sb.append("+\n");
            else if (x.doubleValue() == 0) sb.append("0\n");
            else sb.append("-\n");
        }



        System.out.println(sb);
    }
}

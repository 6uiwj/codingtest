package ali_mul_prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        String ans = "";


        while (true) {
            x = Integer.parseInt(br.readLine());
            int y = 0;
            if (x == -1) break;
            ans += x;
            for (int i = 1; i < x; i++) {
                if (x % (i) == 0) {
                    y += i;

                }
            }
//            if(x==y) {
//                sb.delete(sb.toString().length() - 2, sb.toString().length() - 1);
//                sb.insert(0, x+" = ");
//                sb.append("\n");
//            } else sb.append(x+" is NOT perfect.\n");
//        }
//        br.close();
//        System.out.println(sb.deleteCharAt(sb.length()-1));
        }
    }
}
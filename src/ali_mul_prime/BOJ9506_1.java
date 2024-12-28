package ali_mul_prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9506_1 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int x = 0;

            while (true) {
                x = Integer.parseInt(br.readLine());
                int y = 0;
                StringBuilder sb = new StringBuilder();
                if(x==-1) break;
                for(int i=1; i<x; i++) {
                    if(x%(i)==0) {
                        y+=i;
                        sb.append(i + " + ");
                    }
                }
                if(x==y) {
                    sb.delete(sb.length() - 3, sb.length());
                    System.out.println(sb.insert(0, x+" = "));
                } else System.out.println(x+" is NOT perfect.");
            }
            br.close();

        }
    }



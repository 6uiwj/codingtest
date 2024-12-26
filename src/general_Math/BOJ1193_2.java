package general_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1193_2 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            int max = 0;
            int line = 0;
            int top = 0;
            int under = 0;

            while (a > max) {
                line++;
                max += line;
            }
            int gap = max - a;

            if (line % 2 == 0) {
                top = line - gap;
                under = gap + 1;
            }
            else {
                top = gap + 1;
                under = line - gap;
            }
            System.out.println(top + "/" + under);
        }
    }


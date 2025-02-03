package brute_force;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ19532_4 {
        public static void main(String[] args) throws IOException {
            int a= readInt();
            int b = readInt();
            int c = readInt();
            int d = readInt();
            int e = readInt();
            int f = readInt();

            int x=0;
            // y를 먼저 구하기
            int de = (b * d - e * a);

            int y = (c * d - f * a) / de;

            if (a != 0) {
                x = (b * f - c * e) / (b * d - e * a);
            } else if (d != 0) {
                x = (b * f - c * e) / (b * d);
            }
            System.out.println(x + " " + y);
        }


    private static int readInt() throws IOException {
        int out = 0;
        boolean isNegative = false;

        while (true) {
            int n = System.in.read();
            if (n <= 32) return isNegative ? out * (-1) : out;
            else if (n == '-') isNegative = true;
            else out = (out << 3) + (out << 1) + (n - '0');
        }
    }
    }


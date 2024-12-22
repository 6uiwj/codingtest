package general_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2745_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String n1 = input[0]; //변환대상
        int base = Integer.parseInt(input[1]);  //n진법

        int num = 0;
        int mul = 1;

        for (int i = n1.length() - 1; i >= 0; i--) {
            char c = n1.charAt(i);
            int value = (Character.isDigit(c)) ? c - '0' : c - 'A' + 10;

            num += value * mul;
            mul *= base;
        }

        System.out.println(num);
    }
}

package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt(); //123
//        int b = scanner.nextInt(); //213
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        String temp = String.valueOf(b);
        for(int i = temp.length()-1; i>=0; i--) {
            int c = a*Integer.parseInt(String.valueOf(temp.charAt(i)));
            System.out.println(c);
        }
        System.out.println(a*b);

    }
}

package general_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n = br.readLine().split(" ");
        String n1 = n[0];
        int num = 0;
        int d = Integer.parseInt(n[1]);
        int d1 = 1;
        for(int i =n1.length()-1; i>=0; i--) {
            char n2 = n1.charAt(i);
            int n3 = n2;
            if(n3>=65) num += (n3-55)*d1;
            else  num += (n3-48)*d1;

            d1 *= d;
        }

        System.out.println(num);
    }

}

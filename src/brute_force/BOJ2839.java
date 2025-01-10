package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //18
        int x = 0, y = 0;
        int min = 1666;
        int max = n/5;
        for(int i =0; i<=max; i++) {
            if ((n - 5 * x) % 3 == 0) { //해를 만족하는 x=i일때 x,y가 존재하는지?
                y = (n - 5 * x) / 3;  //만족하면 y를 구한다.
                    if (x + y < min) min = x + y;
            }
                x++;
        }
        System.out.println(min==1666? -1 : min);
    }
}

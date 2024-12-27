package general_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2869_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n =System.nanoTime();
        String[] x = br.readLine().split(" ");
        int up = Integer.parseInt(x[0]); //올라가유
        int down = Integer.parseInt(x[1]); //내려가유
        int t = Integer.parseInt(x[2]); //정상이에유

        int r = up - down; //하루 올라가는 거리에유
        int d = (t - up) / r + 1; //마지막 날전까지 올라가는 데 걸리는 날짜에유

        if ((t - up) % r > 0) {
            d++;
        }
        System.out.println(d);
        long m = System.nanoTime();
        System.out.println((m-n)/1_000_000_000.0);
    }
}

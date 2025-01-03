package time_comp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ24266 {
    private static int N;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        System.out.println((long)N*N*N + "\n"+3);
    }
}

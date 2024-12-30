package general_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int x = Math.min(Integer.parseInt(a[0]),Integer.parseInt(a[2])-Integer.parseInt(a[0]));
        int y = Math.min(Integer.parseInt(a[1]),Integer.parseInt(a[3])-Integer.parseInt(a[1]));

        System.out.println(Math.min(x,y));
    }
}

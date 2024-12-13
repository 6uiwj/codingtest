package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder a = new StringBuilder(st.nextToken()).reverse();
        StringBuilder b = new StringBuilder(st.nextToken()).reverse();

        System.out.println(Integer.parseInt(a.toString()) < Integer.parseInt(b.toString()) ? b : a);
    }
}

package conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" ");

            int A = Integer.parseInt(a[0]);
            int B = Integer.parseInt(a[1]);
            if(A>B) System.out.println(">");
            if(A<B) System.out.println("<");
            if (A==B) System.out.println("==");


    }
}

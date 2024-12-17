package stepup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
            if (a.contains("c=")) a = a.replace("c=", "*");
            if (a.contains("c-")) a = a.replace("c-", "*");
            if (a.contains("dz=")) a = a.replace("dz=","*");
            if (a.contains("d-")) a = a.replace("d-", "*");
            if (a.contains("lj")) a = a.replace("lj", "*");
            if (a.contains("nj")) a = a.replace("nj", "*");
            if (a.contains("s=")) a = a.replace("s=", "*");
            if (a.contains("z=")) a = a.replace("z=", "*");
            System.out.println(a.length());
    }
}

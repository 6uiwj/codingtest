import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] b = a.split(" ");

        long d = Long.parseLong(b[0]);
        long e = Long.parseLong(b[1]);
        long f = Long.parseLong(b[2]);
        long answer = d+e+f;

        System.out.println(answer);
    }
}

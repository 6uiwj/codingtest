import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long i = (long) Math.sqrt(2*S);
        long answer = 0;
        while (i*(i+1) <= 2*S) {
            i++;
        }
        System.out.println(i-1);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String[] a = br.readLine().split(" ");
            if(a[0].equals("#")) break;
            if(Integer.parseInt(a[1])>17 || Integer.parseInt(a[2])>=80) {
                sb.append(a[0]+" Senior\n");
            } else sb.append(a[0]+" Junior\n");
        }
        System.out.println(sb);
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int i = 0;
            String a = br.readLine();
            if(a.equals("#")) break;
            a = a.toLowerCase();
            for(int j = 0; j<a.length(); j++) {
                if (a.charAt(j)=='a'||a.charAt(j)=='e'||a.charAt(j)=='i'||a.charAt(j)=='o'||a.charAt(j)=='u') i++;
            }
            System.out.println(i);
        }
    }
}

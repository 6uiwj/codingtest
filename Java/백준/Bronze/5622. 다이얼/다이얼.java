import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        char s;
        int t = 0;

        for(int i = 0; i<a.length(); i++) {
            s = a.charAt(i); //67 66 67

            if (65 <= s && s < 68) t += 3;
            else if (68 <= s && s < 71) {
                t += 4;
            } else if (71 <= s && s < 74) {
                t += 5;
            } else if (74 <= s && s < 77) {
                t += 6;
            } else if (77 <= s && s < 80) {
                t += 7;
            } else if (80 <= s && s < 84) {
                t += 8;
            } else if (84 <= s && s < 87) {
                t += 9;
            } else if (87 <= s && s < 91) {
                t += 10;
            }
        }

        System.out.println(t);
    }
}

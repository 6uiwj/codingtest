import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] users = new String[n];
        for (int i=0; i<n; i++) {
            users[i] = br.readLine();
        }
        Arrays.sort(users, (a,b)-> {
            int subA = Integer.parseInt(a.substring(0,a.indexOf(" ")));
            int subB = Integer.parseInt(b.substring(0,b.indexOf(" ")));
            return subA-subB;
        });

        for(String word : users) {
            System.out.println(word);
        }

    }
}

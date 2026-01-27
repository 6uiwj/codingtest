import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        Set<String> comb = new HashSet<>();
        for(int i = 0; i< word.length(); i++) {
            for(int j = i+1; j <= word.length(); j++) {
                comb.add(word.substring(i,j));
            }
        }
        System.out.println(comb.size());
    }


}

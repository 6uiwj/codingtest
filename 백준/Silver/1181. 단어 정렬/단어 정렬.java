import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];

        for(int i = 0; i < n; i++){
            words[i] = br.readLine();

        }

        words = Arrays.stream(words)
            .distinct()
            .sorted(
                Comparator.comparingInt(String::length)
            .thenComparing(String::compareTo))
            .toArray(String[]::new);
        ;


        for(String word : words){
            sb.append(word+"\n");
        };
        System.out.println(sb.toString());
    }
}

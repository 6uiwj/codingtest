
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        List<String> words = new ArrayList<>();
        for(int i = 0; i < n; i++){
            words.add(br.readLine());
        }

        words = words.stream()
            .distinct()
            .sorted(
                Comparator.comparingInt(String::length)
            .thenComparing(String::compareTo))
                    .collect(Collectors.toList());


        for(String word : words){
            sb.append(word+"\n");
        };
        System.out.println(sb.toString());
    }
}

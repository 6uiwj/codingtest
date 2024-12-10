package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> x = new ArrayList<>(); //1 3 4 5 7
        for(int i = 1; i<=30; i++) {
            x.add(i);
        }

        for(int i=1; i<=28; i++) {
            x.remove(Integer.valueOf(Integer.parseInt(br.readLine())));
        }
        x.stream().sorted().forEach(System.out::println);
    }
}

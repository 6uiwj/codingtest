package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class BOJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> a = new ArrayList<>();

        for(int i = 0; i<n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        int x = a.stream().mapToInt(Integer::intValue).max().getAsInt();
        int y = a.stream().mapToInt(Integer::intValue).min().getAsInt();

        System.out.println(y+" "+x);
    }
}

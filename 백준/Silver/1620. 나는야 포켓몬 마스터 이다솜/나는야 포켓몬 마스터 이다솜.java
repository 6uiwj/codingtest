import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        StringBuilder sb = new StringBuilder();
        List<String> numToName = new ArrayList<>();
        Map<String, Integer> nameToNum = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String name = br.readLine();
            numToName.add(name);
            nameToNum.put(name, i+1);
        }

        for(int i = 0; i< m; i++) {
            String a = br.readLine();
            if (Character.isDigit(a.charAt(0))) {
                sb.append(numToName.get(Integer.parseInt(a) - 1)).append("\n");
            } else {
                sb.append(nameToNum.get(a)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
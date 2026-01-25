import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int count = 0;
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> notHeard = new HashMap<>();
        Set<String> answer = new HashSet<>();
        for(int i = 0; i<n; i++) {
            notHeard.put(br.readLine(),1);
        }
        for(int i = 0; i<m; i++) {
            String name = br.readLine();
            if(notHeard.containsKey(name)) {
                count++;
                answer.add(name);
                continue;
            }
        }
        Object[] result = answer.stream().sorted().toArray();
        for(Object a : result) {
            sb.append(a).append("\n");
        }
        System.out.println(count + "\n" + sb);

    }
}

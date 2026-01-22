import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> employees = new TreeSet<String>(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        int n =  Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String[] split = br.readLine().split(" ");
            employees.add(split[0]);
            if(split[1].equals("leave")) {
                employees.remove(split[0]);
            }
        }
        for(String name :  employees){
            System.out.println(name);
        }
    }
}

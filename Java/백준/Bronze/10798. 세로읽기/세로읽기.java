import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr1 = new String[5][15];
        for(int i =0; i<5; i++) {
            String arr[] = br.readLine().split("");
            for(int j = 0; j<arr.length; j++) {
                arr1[i][j] = arr[j];
            }
        }
        for(int i = 0; i<15; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr1[j][i]==null) continue;
                System.out.print(arr1[j][i]);
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = input.length();
        int[] num = new int[input.length()];

        for(int i = 0; i < n; i++ ) {
            num[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        for(int i = 0; i < n-1; i++) {
            int max = -1;
            int idx = 0;
            int temp = 0;
            for(int j = i; j<n; j++) {
                if (num[j] > max) { 
                    max = num[j];
                    idx = j;
                }
            }
            temp= num[i];
            num[i] = max;
            num[idx] = temp;
        }

        for(int ans : num) {
            System.out.print(ans);
        }
    }



}

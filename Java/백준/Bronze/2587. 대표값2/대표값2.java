import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputNumber = new int[5];
        int sum = 0;
        for (int i =0; i<inputNumber.length; i++) {
            inputNumber[i] = Integer.parseInt(br.readLine());
            sum += inputNumber[i];
        }
        Arrays.sort(inputNumber);

        int center = inputNumber[(inputNumber.length/2)];
        int avg = sum/inputNumber.length;

        System.out.println(avg +"\n" +center);
    }
}

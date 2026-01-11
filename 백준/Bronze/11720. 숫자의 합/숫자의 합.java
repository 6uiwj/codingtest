import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String num = br.readLine();
        char[] arr = num.toCharArray();
        int answer = 0;
        for (int i = 0; i < count; i++) {
            answer += arr[i] - '0';
        }

        System.out.println(answer);


    }

}
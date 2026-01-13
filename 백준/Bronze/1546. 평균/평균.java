import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] score = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        int m = max(score);
        double fin = 0;
        for (int i = 0; i < score.length; i++) {
            fin += (double)score[i]/m*100;

        }
        System.out.println(fin/num);
    }

    public static int max(int[] score) {
        int temp = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > temp) {
                temp = score[i];
            }
        }
        return temp;
    }
}

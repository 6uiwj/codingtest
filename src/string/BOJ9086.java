package string;

import java.io.*;

public class BOJ9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine()); //테스트 수
        String word = "";
        for(int i = 0; i<t; i++) {
            word = br.readLine();
            bw.write(word.charAt(0)+""+word.charAt(word.length()-1)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

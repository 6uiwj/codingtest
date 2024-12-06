package iteration;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i<a; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            bw.write("Case #"+(i+1)+": "+ x+" + "+y+" = "+(x+y)+"\n");

        }
        br.close();
        bw.flush();
        bw.close();

    }
}

package order;

import java.io.*;

public class BOJ2751_3 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[] sort = new boolean[2000001];
        for(int i = 0; i< n; i++) {
            int temp = Integer.parseInt(br.readLine());
            if(temp < 0) {
                temp = Math.abs(temp) + 1000000;
                sort[temp] = true;
            }
            else sort[temp] = true;        }

        StringBuilder sb = new StringBuilder();
        for(int i = sort.length-1; i >= 1000001; i--) {
            if(sort[i]) sb.append((-1)*(i-1000000)+"\n");
        }

        for(int i = 0; i <= 1000000; i++) {
            if(sort[i]) sb.append(i+"\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}

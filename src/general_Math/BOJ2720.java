package general_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int c = 0;
        int[] ch = new int[8];
        ch[0] = 25; ch[1] = 10; ch[2] = 5; ch[3] = 1;
        for(int i = 0; i<t; i++) {
            c = Integer.parseInt(br.readLine());

                ch[4] = c / ch[0]; // 124/25
                c = c % ch[0];

                ch[5] = c / ch[1];
                c = c % ch[1];

                ch[6] = c / ch[2];
                c = c % ch[2];

                ch[7] = c;
            sb.append(ch[4]+ " " + ch[5]+ " " + ch[6]+" " + ch[7] +"\n");
            }
        System.out.println(sb);
        }
    }


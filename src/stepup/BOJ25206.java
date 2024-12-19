package stepup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double s = 0; //학점
        String g= "";
        double count = 0; //평균
        int sc = 0;
        StringTokenizer st;

        for(int i = 0; i<20; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            s = Integer.parseInt(st.nextToken());
            g = st.nextToken();
            if(!g.equals("P")) { sc+=s; } else continue;
            switch (g) {
                case "A+" : count+= s*4.5; break;
                case "A0" : count+= s*4.0; break;
                case "B+" : count+= s*3.5; break;
                case "B0" : count+= s*3.0; break;
                case "C+" : count+= s*2.5; break;
                case "C0" : count+= s*2.0; break;
                case "D+" : count+= s*1.5; break;
                case "D0" : count+= s*1.0; break;
                case "F" : count+= s*0; break;
                case "P" :

            }
        }
        System.out.println(count/sc);
    }
}

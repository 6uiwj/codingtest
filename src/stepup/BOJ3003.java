package stepup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = 1-Integer.parseInt(st.nextToken());;
            int q = 1-Integer.parseInt(st.nextToken());;
            int l = 2-Integer.parseInt(st.nextToken());;
            int b = 2-Integer.parseInt(st.nextToken());;
            int n = 2-Integer.parseInt(st.nextToken());;
            int p = 8-Integer.parseInt(st.nextToken());;

            System.out.print(k+" " +q+" "+l+" "+b+" "+n+" "+p+" ");
        }
    }
}

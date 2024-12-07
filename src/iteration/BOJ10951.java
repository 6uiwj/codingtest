package iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ10951 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String c = "";
//
//        while((c=br.readLine()) != null) {
//            StringTokenizer st = new StringTokenizer(c," ");
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//
//            System.out.println(a + b);
//        }

        Scanner in=new Scanner(System.in);

        while(in.hasNextInt()){

            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(a+b);

        }
        in.close();
    }
}


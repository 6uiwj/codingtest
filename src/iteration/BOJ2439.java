package iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String star = "";
//        for(int i=0; i<a; i++) {
//            for (int j = 0; j < a-i-1; j++) {
//                System.out.print(" ");
//            }
//            System.out.println(star);
//            star += "*";
//        }
        for(int i = 0; i<a; i++) {
            System.out.printf("%"+a+"s\n",star+="*");
        }
    }
}

//interface Main{
//    static void main(String[] A) {
//        String t="";
//        for(int n=new java.util.Scanner(System.in).nextInt(), j=n; n-->0;
//            System.out.printf("%"+j+"s\n",t+="*"));
//    }
//}

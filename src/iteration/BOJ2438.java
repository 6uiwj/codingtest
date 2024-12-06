package iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b ="";
        for ( int i =0; i<a; i++) {
            b+="*";
            System.out.println(b);
        }



//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String b ="";
//        for (int a = Integer.parseInt(br.readLine());
//            a-- > 0;
//        System.out.println(b+="*"));


//        for(int i=0, n=new java.util.Scanner(System.in).nextInt(); i++<n;
//            System.out.println("*".repeat(i)));

    }
}




/**
 *
 * interface Main {
 *      static void main(String[] a) {
 *          var s="";
 *          for(int n=new java.util.Scanner(System.in).nextInt();
 *              n-->0;
 *              System.out.println(s+="*"));
 *      }
 * }
 */
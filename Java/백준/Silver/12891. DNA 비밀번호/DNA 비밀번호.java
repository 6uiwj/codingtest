import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] sp = br.readLine().split(" ");
            int s = Integer.parseInt(sp[0]);
            int p = Integer.parseInt(sp[1]);
            String pw = br.readLine();
            String[] gene = br. readLine().split(" ");
            int[] alpha = new int[4];
            int a = Integer.parseInt(gene[0]);
            int c = Integer.parseInt(gene[1]);
            int g = Integer.parseInt(gene[2]);
            int t = Integer.parseInt(gene[3]);

            int i = 0;
            int count = 0;
            String subPw = pw.substring(0,p);
            int pointer = 0;
        
        while(i<p) {
                if(subPw.charAt(i)=='A') alpha[0]++;
                if(subPw.charAt(i)=='C') alpha[1]++;
                if(subPw.charAt(i)=='G') alpha[2]++;
                if(subPw.charAt(i)=='T') alpha[3]++;
                i++;
        }
            if(alpha[0]>=a && alpha[1]>=c && alpha[2]>=g && alpha[3]>=t) count++; //1


            while(i<s) {
                if(pw.charAt(i)=='A') alpha[0]++;
                if(pw.charAt(i)=='C') alpha[1]++;
                if(pw.charAt(i)=='G') alpha[2]++;
                if(pw.charAt(i)=='T') alpha[3]++;
                if(pw.charAt(pointer)=='A') alpha[0]--;
                if(pw.charAt(pointer)=='C') alpha[1]--;
                if(pw.charAt(pointer)=='G') alpha[2]--;
                if(pw.charAt(pointer)=='T') alpha[3]--; //TA
                if(alpha[0]>=a && alpha[1]>=c && alpha[2]>=g && alpha[3]>=t) count++;
                i++;
                pointer++;
        }
            System.out.println(count);

    }
}

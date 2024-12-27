package general_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2869_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split(" ");
        int up = Integer.parseInt(x[0]);
        int down = Integer.parseInt(x[1]);
        int t = Integer.parseInt(x[2]);
        //int last = t-down;
       // int ans = up-down;

        int c= (t-down) / (up-down); //2
        int remain = t-(up*c)+(down*c);
        if(remain>down) c+=1;
        System.out.println(c);        }
    }



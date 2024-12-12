package string;

import java.io.*;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); //97-122
        int[] alp = new int[123];
        for(int i =97; i<=122; i++) {
            alp[i]=-1;

            for (int j = 0; j < s.length(); j++) {
                if(i==s.charAt(j) && alp[i]==-1) {
                    alp[i]=j;
                }
            }

        }
        for(int i=97; i<123; i++) {
            System.out.print(alp[i]+" ");
        }

        }
    }


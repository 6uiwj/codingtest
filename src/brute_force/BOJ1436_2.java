package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1436_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans=666;
        int count=1;

        while(count<n) {
            System.out.println(count + " : " + ans);
            //666으로 끝나는 수
            if((ans-666)%10==0) { //2665666
                ans += 1000;  //2666666
                StringBuilder sb = new StringBuilder(String.valueOf(ans));
                //String temp = String.valueOf(ans);
                String word = "666";
                //끝에 666을빼고 6을가지고 있는 수 600666
                if (sb.delete(sb.lastIndexOf(word),sb.lastIndexOf(word)+word.length()).toString().contains("6")) {
                    int t = ans; //(2666)666 //(6)666 //600666
                    int d = 0; //2
                    //끝자리가 6일 때
                    //while (t%10==6 && t>999) {
                    t=-666;
                    while(String.valueOf(t).contains("666") &&t%10==6) {
                        if(!String.valueOf(t).contains("6666")) break;
                        t=t/10; //26666 //666
                        d++; //1
                    }
                    int minus=0; //temp=2666666
                    if(sb.charAt(sb.length()-1)=='6') {
                        for (int j=0; j<d; j++) { //0-2
                            minus = minus +6*(int)Math.pow(10,j); //66
                        }
                        ans-=minus; //2666600
                        for (int i = 0; i < Math.pow(10,d)-1; i++) { //0-9
                            count++;
                           System.out.println(count + " : " + ans);
                            ans++;
                            if(count==n-1) break;
                        }
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(ans));
                //String t = String.valueOf(ans); //2666699
                int i =0;//2
                if (sb.charAt(sb.length()-1) == '9') {
                    while(sb.charAt(sb.length()-1)=='9') {
                        ans = ans - 3*((int)Math.pow(10,i)); //2666666
                        sb = sb.deleteCharAt(sb.length()-1); //sb=26666
                        i++;
                    }
                    ans+=1000; //2667666
                } else {
                    ans++;
                }
            }
            if(count==n-1) break;
            count++;
        }
        System.out.println(ans);
    }
}

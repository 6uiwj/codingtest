package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1436_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans=666;
        int count=1;

        while(count<=n) {
            System.out.println(count+" : "+ans); //5666
            if((ans-666)%10==0) { //666으로 끝날때
               // System.out.println(ans+"if문 거침");
                ans += 1000; //6666
                String temp = String.valueOf(ans);
                //6이 4개이상이면
                //**
                if (temp.replace("666", "").contains("6")) {
                    //1의 자리가 6이면 - 6을빼주고 9까지 1씩 더함 (66606-> 66600~66609)
                    int t = ans; //6666
                    int d = 0; //1
                    while (t%10==6 && t>999) {
                        if(!String.valueOf(t).contains("6666")) break;
                        t=t/10;
                        d++;
                    }
                    int minus=0;
                    if(temp.replace("666", "").charAt(temp.replace("666", "").length()-1)=='6') {
                        for (int j=0; j<d; j++) {
                            minus = minus +6*(int)Math.pow(10,j); //6
                        }
                        ans-=minus; //6660
                        //**--
                        for (int i = 0; i < Math.pow(10,d)-1; i++) { //0-9
                            count++;
                            System.out.println(count + " : " + ans);
                            ans++;
                            if(count==n) break;

                        }
                    }
                }
            } else { //6669
                if (String.valueOf(ans).charAt(String.valueOf(ans).length() - 1) == '9') {
                   // System.out.println("String.valueOf(ans): " + String.valueOf(ans));
                    ans = ans - 3 + 1000;
                }
                else {
                    ans++;
                  //  System.out.println(ans+" 마지막 else문");
                }
            }
            count++;
           // System.out.println("예?");
        }


    }
}

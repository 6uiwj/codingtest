package iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //영수증에 적힌 총 금액 X
        int total = Integer.parseInt(br.readLine());
        //구매한 물건 종류의 수 N
        int num = Integer.parseInt(br.readLine());
        //각 물건의 가격 a와 개수 b (X N개)
        int ans = 0;
        for(int i=0; i<num; i++) {
            String set[] = br.readLine().split(" ");
            int price = Integer.parseInt(set[0]);
            int count = Integer.parseInt(set[1]);

            ans += price*count;
        }


        //출력: 금액이 일치하는지?
        String x = total == ans ? "Yes" : "No";
        System.out.println(x);
    }
}

package iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AB3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); //테스트 케이스 개수
        int ans[] = new int[t]; //테스트 결과 저장할 배열(테스트 개수만큼)

        for (int i=0; i<t; i++) { //테스트 개수만큼 반복해서 입력받을 것
            String data[] = br.readLine().split(" ");//더할 두 수
            int a = Integer.parseInt(data[0]);
            int b = Integer.parseInt(data[1]);

            ans[i] = a+b; //두 수의 합 저장
        }

        for (int z : ans) {
            System.out.println(z); //결과 출력
        }

    }
}

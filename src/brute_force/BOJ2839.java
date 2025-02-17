package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //18
        int x = 0, y = 0; //x: 5kg 봉지 수,  y: 3kg 봉지 수
        int min = 1666; //N의 촤댓값이 5000이므로 배달 할 봉지 수는 1666봉지를 넘지 못함
        int max = n/5;  //최대 5kg 봉지를 사용할 수 있는 개수

        for(int i =0; i<=max; i++) { //5kg 봉지 수를 늘려가며 최솟값 찾기
            ///n에서 5kg 봉지로 x개 사용한 후 남은 무게가 3kg 봉지로 나누어 떨어지는지?
            if ((n - 5 * x) % 3 == 0) {
                y = (n - 5 * x) / 3;  //나누어 떨어지면 3kg 봉지수를 구한다.
                    if (x + y < min) min = x + y; //x+y값이 최소가 되는 min을 구한다.
            }
                x++; //5kg 봉지 개수 증가
        }
        System.out.println(min==1666? -1 : min);
    }
}

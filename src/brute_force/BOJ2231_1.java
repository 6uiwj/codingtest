package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2231_1 {
    /**
     * n : 주어진 수
     * m : n의 생성자
     * j : n의 길이 (몇 자리 수인지)
     * sum: 분해합(m과 m의 각 자리의 합을 저장할 변수)
     * i : 생성자인지 아닌지 판단하기 위해 테스트 해 볼 숫자
     *
     *  idea)
     * 각 자리수의 최댓값은 9이다. 주어진 수의 자리수가 j개라면,
     * 자릿수의 합의 최댓값은 9*j이다.
     * 따라서 생성자는 최소 (n-9*j)이상이어야 한다.
     * 생성자로 계산한 이 n-9*j 값이 음수가 되는 경우를 생각해, 1과 n-9*j중 작은 값부터 탐색을 시작한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String v = br.readLine();
        br.close();
        int j = v.length(); //주어진 수의 길이
        int n = Integer.parseInt(v); //주어진 수
        int m = 0; //정답인 생성자를 담을 변수!
        int sum = 0; //m의 분해합
        int k = 0; //분해합을 계산하기 위해 자리수를 쪼개주기 위한 변수

        for (int i = Math.max(n-9*j,1); i < n; i++) {
            sum = i; //먼저 자기자신을 더해준다.
            k = i;
            while (k>0) { //i의 각 자리수를 쪼개서 sum에 더하는 과정 (ex:123이면 1+2+3)
                sum += k%10;
                k /=10;
            }
            if(sum ==n) { //i의 분해합이 n과 같다면 계산을 멈춘다.
                m =i;
                break;
            }
        }
        System.out.println(m);
    }

}

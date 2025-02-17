package order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 *
 * 출력
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */

/**
 * IDEA) 배열의 0~1000번 INDEX에 양수를 넣고, 1001~2000번 INDEX에 음수(-1000~-1)을 넣는다
 */
public class BOJ2750_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[2001]; //-1000 <= X <= 1000
        int temp = 10000;
        for(int i = 0; i < n; i++) {
            temp = Integer.parseInt(br.readLine());  //N개 입력받기
            if(temp < 0) { //입력받은 숫자가 음수일 때
                temp = Math.abs(temp) + 1000; //-1이면 1001, -2면 1002 ...-1000이면 2000번에 저장
                num[temp] = temp;
            } else if(temp == 0) num[0]=10000;
            else num[temp] = temp; //양수이면 N과 일치하는 INDEX에 값 저장
        }
        //위의 과정까지 입력받은 숫자는 숫자와 같은 num배열의 index에 값이 저장되어 있고,
        //음수의 경우는 |N|+1000번에 저장, 0은 0번 index에 10000으로 저장
        //cf) 0은 10000으로 저장한 이유 : 입력받은 숫자를 정렬해서 출력할 때
        //num배열에 값이 있는지 없는지를 확인하고 숫자를 꺼낼건데, 입력받지 않은 수는 배열의 기본값 0으로
        //저장되어 있으므로, 0은 임의로 10000이라는 값으로 치환하였다.
        //출력하기
        StringBuilder sb = new StringBuilder();
        for(int i = num.length-1; i >= 1001; i--) {
            if(num[i] != 0) sb.append((-1)*(num[i]-1000)+"\n");
        }

        if(num[0] == 10000) sb.append("0\n");

        for(int i = 1; i <= 1000; i++) {
            if(num[i]!=0) sb.append(num[i]+"\n");
        }
        System.out.println(sb);
    }

//    private static int readInt() throws IOException {
//        int out = 0;
//        boolean isNegative = false;
//
//        while(true) {
//            int n = System.in.read();
//            if(n <= 32) return isNegative ? (-1)*out : out;
//            else if(n == '-') isNegative = true;
//            else out = (out<<3) + (out<<1) + (n-'0');
//
//        }
//    }
}

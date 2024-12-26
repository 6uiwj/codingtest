package general_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1193_1 {
    /**
     * idea)
     *  1. 대각선(/) 라인을 따라서 지그재그로 이동하므로 대각선 별로 분수들을 묶는다.
     *      예) (1/1) - 1열
     *          (1/2, 2/1) - 2열
     *          (1/3, 2/2, 3/1) 3열
     *
     *  2. 각 열 안의 분수들은 분모와 분자의 합이 같고, n열의 분모 분자의 합은 n+1이다.
     *      (2열은 분모+분자=3, 3열은 분모+분자=4)
     *
     *  3. 분모 분자의 합이 짝수인 열은 왼쪽 아래에서 오른쪽 위로 이동(↗),
     *         홀수인 열은 오른쪽 위에서 왼쪽 아래로 이동한다.(↙)
     *    3-1 따라서 짝수인 열은 분모가 1,2,3..으로 증가하고 분자가 역순으로 줄어든다
     *        홀수인 열은 분자가 1,2,3..으로 증가하고 분모가 역순으로 줄어든다.
     *
     *  4. 각 열이 가진 분수의 개수는 1, 2, 3, 4, 5...로 증가한다.
     *
     *  5. 4번의 사실을 이용하여 입력받은 X가 몇번째 열에 속하고,
     *      그 열에서 몇 번쨰 분수인지 찾는다.
     *      예) X=6이면 1번 1개, 2번째 열은 2개, 3번째 열은 3개의 분수가 존재하므로
     *          X는 3번째 열의 3번째 분수가 된다.
     *
     *  6. 2번의 사실을 이용하여 3번째 열의 3번째 분수는 분모 분자의 합이 4인 것을 알 수 있다.
     *
     *  7. 3번의 사실을 이용하여 분자의 합이 4인 열(=짝수)은 분모가 1,2,3..으로 증가하고
     *         분자가 역순으로 감소하는 것을 알 수 있다.
     *     따라서 분모는 3이고, 분자는 (분모·분자의 합)-분모 = 4-3=1이다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine()); //입력 - 몇번째 분수인지
        int columnLast = 1; //X가 속한 열의 마지막 분수는 몇 번째 분수?
        int fractionSum = 2; //분모와 분자의 합
        int columnIndex = 0; //X가 속한 열에서 X가 몇 번 index인지

        String ans ="";
        while(x> columnLast) { //X가 몇 번쩨 열에 속하는지 구하기
            columnLast += fractionSum;
            fractionSum++;
        }
        columnIndex = x-(columnLast - fractionSum +1);
                int a= columnIndex;
                int b= fractionSum - columnIndex;
        System.out.println(ans = fractionSum %2==0?  b+"/"+a:a+"/"+b);
            }
}

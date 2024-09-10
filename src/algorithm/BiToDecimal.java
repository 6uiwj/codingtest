package algorithm;

public class BiToDecimal {
    public static void main(String[] args) {
        /**
         * 이진수를 십진수로 변환하는 코드
         * strategy : 이진수의 오른쪽 맨 끝자리가 1인지 0인지 판별하고,
         *  값을 계산하여 answer에 더해준 다음 삭제
         *  -> 남은 숫자 중 다시 오른쪽 맨 끝자리를 판별, 삭제하는 작업 반복
         */
        int bi = 1011101; //2^6 + 2^4 + 2^3 + 2^2 + 2^0 = 93 -> 2^0부터 계산
        int answer = 0;
        int num = 1;
        while (bi > 0) {
            if (bi % 2 == 1) { //bi의 마지막 자리 수가 1이라면
                //2^n을 더해줌
                //num = 2^n을 나타냄
                answer = answer + num;
            }
            bi = bi / 10; //마지막 자리를 없애고 다음 자리로 넘어감 (1011101 -> 101110)
            num = num * 2; //반복문이 한번 돌 때마다 2의 지수승으로 하나씩 값이 올라감

        }
        System.out.println(answer);
    }
}

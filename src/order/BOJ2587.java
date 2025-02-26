package order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 대표값 2
 * 5개 숫자의 평균과 중앙값 구하기
 */
public class BOJ2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputNumber = new int[5];
        int sum = 0;
        for (int i =0; i<inputNumber.length; i++) {
            inputNumber[i] = Integer.parseInt(br.readLine()); //5개 수를 저장할 배열
            sum += inputNumber[i]; //평균을 계산하기 위해 5개의 수의 합을 저장할 변수
        }
        Arrays.sort(inputNumber); //오름차순 정렬하기

        int center = inputNumber[(inputNumber.length/2)]; //중앙값 구하기(배열이 0부터 시작이므로 그냥 /2 해주면 됨)
        int avg = sum/inputNumber.length; //평균 구하기

        System.out.println(avg +"\n" +center);

    }
}

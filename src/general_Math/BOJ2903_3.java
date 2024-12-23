package general_Math;

import java.io.IOException;

public class BOJ2903_3 {
    public static void main(String[] args) throws IOException {
        int n = 0;
        int i;
        while ((i = System.in.read()) != '\n') { // '\n'까지 입력받음
            if (i >= '0' && i <= '9') { // 숫자인 경우만 처리
                n = n * 10 + (i - '0'); // 자릿수 변환
            }
        }

        int d = 2;
        for(int j=0; j<n; j++) {
            d = d*2-1;
        }
        System.out.println(d*d);
    }
}

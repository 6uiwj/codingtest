package temp;

import java.io.IOException;

public class Sir {
    //실행 부분
    public static void main(String[] args) throws IOException {
        int ex1 = readInt();
        int ex2 = readInt();
        int ex3 = readInt();

        System.out.println("첫 번째 입력: " + ex1);
        System.out.println("두 번째 입력: " + ex2);
        System.out.println("세 번째 입력: " + ex3);

    }

    //구현 부분
    private static int readInt() throws IOException {
        int ans = 0;
        boolean isNegative = false;

        while (true) {
            //System.in.read() : 입력받은 데이터를 한 문자씩 읽음
            int n = System.in.read();

            if(n<=32) { //공백이 나오면 리턴
                return isNegative ? ans * (-1) : ans;
            }
            else if (n == '-') isNegative = true; //음수면 부호 저장
            //아스키 코드를 숫자로 변환
            else  ans = (ans <<3) + (ans <<1) + (n&15) ;

        }
    }
}

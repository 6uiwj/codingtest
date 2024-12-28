package general_Math;

import java.io.IOException;
public class BOJ2869_eff_sol {
        public static void main(String[] args) throws IOException{
            int up = readInt();
            int down = readInt();
            int target = readInt();

            target -= up;
            System.out.println((int)Math.ceil((double)target/(up-down))+1);
        }
        static int readInt() throws IOException {
            /**
             * 정수와 공백만 입력받는다고 가정한 코드
             */
            int n = 0;
            boolean isNegative = false; //음수인지 판별
            while (true) {
                int input = System.in.read(); //입력된 데이티를 한 문자씩 읽음
                //32는 공백
                /**
                 * <=32로 설정하는 이유
                 *  -> 공백관련 문자가 32 이하에 있기 때문 (9(Tab), 10(줄바꿈) 13(Carriage Return) 0(Null))
                 */
                if (input<=32) //ASCII 값이 32 이하인 경우(스페이스, 엔터 등), 숫자 입력이 끝났다고 판단 ->리턴
                    return isNegative ? n * -1 : n; //음수면 -를 붙여줘서 출력
                else if(input=='-') //'-'가 입력되면 음수로 판단
                    isNegative = true;
                else //아스키코드를 숫자로 변환(0 = 48, 1=49)
                    //n= n*8 + n*2 + (입력문자를 숫자로 변환)
                    // = n*10 +입력문자를 숫자로 변환
                    // ex) input = 3이면 -> '3'& 15 -> 48+3->51
                /**
                 * 왜 n*10을 해주는가? -> 입력값이 10 이상인 경우 각 자리수를 계산하기 위해 10을 곱해
                 * 기존 값의 자릿수를 한 칸씩 왼쪽으로 밀어야 한다.
                 * 예시: 입력 값 123
                 * 첫 번째 입력 문자 '1':
                 *
                 * ans = 0
                 * ans = (0 * 10) + 1 = 1
                 * 두 번째 입력 문자 '2':
                 *
                 * ans = 1
                 * ans = (1 * 10) + 2 = 12
                 * 세 번째 입력 문자 '3':
                 *
                 * ans = 12
                 * ans = (12 * 10) + 3 = 123
                 *
                 */
                /**
                 * 왜 마지막 4비트가 0~9와 일치하는가?
                 * ASCII 코드 설계에서 숫자 문자들을 48부터 57까지 연속적으로 배정했기 때문에,
                 * 이 값들의 이진수 표현은 마지막 4비트가 0~9와 일치하게 됩니다.
                 *
                 * & 15 연산을 사용하는 이유는 ASCII 코드에서 숫자 문자 '0'~'9'의 마지막 4비트가
                 *  실제 숫자 값(0~9)과 동일하기 때문
                 *  '0' → 48 (2진수: 00110000)
                 * '1' → 49 (2진수: 00110001)
                 * '2' → 50 (2진수: 00110010)
                 * '3' → 51 (2진수: 00110011)
                 * '4' → 52 (2진수: 00110100)
                 * '5' → 53 (2진수: 00110101)
                 * '6' → 54 (2진수: 00110110)
                 * '7' → 55 (2진수: 00110111)
                 * '8' → 56 (2진수: 00111000)
                 * '9' → 57 (2진수: 00111001)
                 *
                 *  15는 2진수로 00001111
                 *  & 15 연산을 통해 뒤의 4비트만 추출하면 숫자 값을 바로 얻을 수 있다.
                 */
                    n = (n<<3) + (n<<1) + (input&15);
            }
        }
    }



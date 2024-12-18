package stepup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1316 {
    public static void main(String[] args) throws IOException {
        /**
         * idea
         * 문자 S의 n번째 알파벳과 n-1번째 알파벳을 비교하고 알파벳이 같으면 n-2번째, n-3번째,,. 도 같은 알파벳인지 확인,
         * 다른 알파벳이 나오면 탐색을 멈추고, 문자열에서 해당 알파벳을 삭제.
         *  삭제한 알파벳이 삭제 후에도 다른 위치에 존재하는지 확인. 존재하면 그룹단어가 아니다.
         * 만약 위에서 n번째 알파벳이 n-1, n-2까지 같은 알파벳이었다면
         * n-3부터 다시 위의 과정 반복
         *
         * --주의사항--
         * 알파벳을 삭제할때마다 문자의 길이와 index위치가 바뀌므로, 뒤에서부터 역순으로 탐색하여 삭제한다.
         * OutofBounds 예외가 뜰 수 있는 부분이 많으므로, 범위 지정에 유의해야하고, 변수의 조건값을 잘 확인할 것
         * continue와 break을 적절하게 사용할 것
         *
         * --코멘트--
         * 코드가 매우 지저분, 쓸데없는 코드가 존재함 -> 다시 풀어보기
         * 속도와 메모리 측면에서 성능이 좋지 않다. -> 다른 방법으로 풀어보기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char b = ' ';
        int ans =0;

        for(int i = 0; i < n; i++) {
            String a = br.readLine();
            StringBuilder sb = new StringBuilder(a);
            for(int j = sb.length()-1; j>=0 ; j--) {
                if(sb.length()<=1) {
                    ans++;
                    break;
                }
                for(int k = j-1; k>=0; k--) {
                    if(sb.charAt(j) != sb.charAt(k)) {
                        b=sb.charAt(j);
                        sb=sb.deleteCharAt(j);
                        break;
                    } else {
                        b=sb.charAt(j);
                        if(k>0 && b==sb.charAt(k-1)) {
                            continue;
                        } else {
                            if(k<j) {
                                sb = sb.delete(k, j + 1);
                                j=k;
                            }
                            break;
                        }
                    }
                }
                if(sb.indexOf(String.valueOf(b))!=-1) {
                    break;
                }
            }
            if (sb.length() == 0) ans++;
        }
        System.out.println(ans);
    }
}

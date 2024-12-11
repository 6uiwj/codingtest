package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ10811 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //바구니 수
        int m = Integer.parseInt(st.nextToken()); //몇 번 시행?
        int[] busket = new int[n+1]; //편의를 위해 index 1~5 사용 (0은 빈값)

        for (int k =0; k<=n; k++) { //각 바구니에 해당하는 번호 부여
            busket[k]=k;
        }

        for( int k = 0; k<m; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()); //역순정렬 시작번호
            int j = Integer.parseInt(st.nextToken()); //역순정렬 끝 번호
            int temp = 0; //swap을 위한 임시공간
            int temp2 = 0;
            if(i==j) continue; //역순 정렬 시작과 끝이 같을 경우 skip
            for(int p=i; p<=(i+j)/2; p++) { //swap
                temp=busket[p];
                busket[p]=busket[j-temp2];
                busket[j-temp2]=temp;
                temp2++;
            }
        }
        for(int k=1; k<busket.length; k++) { //1~5번 index값 출력
            System.out.print(busket[k]+" ");
        }
    }

}

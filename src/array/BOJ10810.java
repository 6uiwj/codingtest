package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10810 {
    public static void main(String[] args) throws IOException {
        //N:바구니 개수
        //M:넣으려는 공 개수(1~N번)
        //i: 처음 넣을 바구니
        //j: 마지막 넣을 바구니
        //k:넣을 공 번 호

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //5
        int m = Integer.parseInt(st.nextToken()); //4
        int busket[] = new int[n]; //5

        for(int x = 0; x<m; x++) { //0<= x <= 3
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-1; //0
            int j = Integer.parseInt(st.nextToken())-1; //1
            int k = Integer.parseInt(st.nextToken()); //2

            for(int y = i; y<=j; y++) { // y= 0~1
                busket[y]=k;
            }
        }

        for(int ans : busket) {
            System.out.print(ans+" ");
        }

    }
}

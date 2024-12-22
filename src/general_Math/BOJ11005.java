package general_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]); //10진법 수 13
        int b = Integer.parseInt(in[1]); //b진법으로 변환 14
        String result = "";
        int temp = 0;

        /**
         *              sb.append(temp > 9 ? (char)(temp+55) : temp);
         *              이렇게 작성했을 때 왼쪽 조건은 char형이고, 오른쪽 조건은 int형이라서
         *              데이터타입이 일관되지 못해 결과에 오류가 생긴다.
         */
        while(n>0) {
            temp = n%b; // 13
            //sb.append(temp > 9 ? (char)(temp+55) : (char)(temp+'0'));
            sb.insert(0,temp > 9 ? (char)(temp+55) : (char)(temp+'0'));
            n/=b;
        }
        System.out.println(sb);
    }
}

/**
 * import java.io.BufferedReader;
 * import java.io.IOException;
 * import java.io.InputStreamReader;
 * import java.util.*;
 *
 * public class Main {
 *     public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         StringTokenizer st = new StringTokenizer(br.readLine());
 *         int N = Integer.parseInt(st.nextToken());
 *         int B = Integer.parseInt(st.nextToken());
 *         Map<Integer, String> map = new HashMap<>();
 *         int num = 65;
 *         for (int i = 10; i <= 35 ; i++) {
 *             map.put(i, String.valueOf((char) num));
 *             num++;
 *         }
 *
 *         List<Integer> list = new ArrayList<>();
 *
 *
 *         while (N >= B){
 *             list.add(N % B);
 *             N = N / B;
 *         }
 *         list.add(N);
 *
 *         StringBuilder sb = new StringBuilder();
 *         int size = list.size();
 *         for (int i = 0; i < size; i++) {
 *             Integer n = list.get(size - i - 1);
 *             if(n < 10){
 *                 sb.append(n);
 *             }else {
 *                 sb.append(map.get(n));
 *             }
 *         }
 *
 *         System.out.println(sb);
 *
 *     }
 * }
 */
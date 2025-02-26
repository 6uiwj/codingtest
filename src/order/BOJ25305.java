package order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * N명이 응시, k명이 입상
 *  -> 커트라인 점수는? (점수 = x)
 *  N=[1,1000],  k=[1,N], x=[0,10000]
 */
public class BOJ25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String[] scoreInput = br.readLine().split(" ");
        int[] score = new int[N];
        for(int i = 0; i<N; i++) {
            score[i] = Integer.parseInt(scoreInput[i]);
        }
        Arrays.sort(score);
        System.out.println(score[N-k]);

    }
}

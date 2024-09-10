package programmers;

import java.util.Arrays;

public class dividedArray {
    public static void main(String[] args) {
        int[] arr= {2, 3, 6, 23, 25,35, 21,7};
        int divisor = 5;
        int temp = 0;

        for ( int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor==0) {
                temp++;
            }
        }
        System.out.println("temp = " + temp);

        int[] answer = Arrays.stream(arr).filter(a -> a%5 == 0)
                .toArray();
        for (int a : answer) {
            System.out.println(answer);
        }
//
//            for(int j=0; j<temp; j++) {
//                for(int i=0; i<arr.length; i++) {
//                    if(arr[i]%divisor==0) {
//                    answer[j]=arr[i];
//                    continue;
//                }
//                    if(answer[j]
//            }
//        }
//        for (int a : answer) {
//            System.out.println(a);
//        }
    }
}

//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//public class temp {
//    public static void main(String[] args) {
////  귀찮으니 scanner 입력 생략
////        Scanner scanner = new Scanner(System.in);
////        int a[] = new int[5];
////
////        for(int i = 0; i<a.length; i++) {
////            System.out.println((i+1)+"번쩨 정수를 입력하세요.");
////            a[i]=scanner.nextInt();
////        }
//        //임의의 배열
//        int a[] = {1, 2, 3, 4, 5};
//
////        //방법1
////        for(int i = 0; i<a.length; i++) {
////            System.out.print(a[i]);
////            if(i==a.length-1) continue;
////            System.out.print(",");
////        }
//
//        String c ="";
//        for(int i = 0; i<a.length; i++) {
//            c += String.valueOf(a[i]);
//        }
//        System.out.print(c.split(","));
//
////        //방법2
////        String result = Arrays.stream(a)
////                .mapToObj(String::valueOf)
////                .collect(Collectors.joining(","));
////        System.out.println(result);
//    }
//}

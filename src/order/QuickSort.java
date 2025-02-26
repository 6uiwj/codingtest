package order;

import java.util.Arrays;

public class QuickSort {

        // 퀵 정렬 함수
        public static void quickSort(int[] arr, int left, int right) {
            if (left < right) { // 배열의 크기가 1 이상일 때만 정렬 수행
                int pivotIndex = partition(arr, left, right); // pivot을 기준으로 분할
                quickSort(arr, left, pivotIndex - 1);  // 왼쪽 부분 정렬
                quickSort(arr, pivotIndex + 1, right); // 오른쪽 부분 정렬
            }
        }

        // 분할(Partition) 함수
        private static int partition(int[] arr, int left, int right) {
            int pivot = arr[right];  // 마지막 요소를 pivot으로 선택
            int i = left - 1;  // 작은 값들이 들어갈 위치

            for (int j = left; j < right; j++) {
                if (arr[j] < pivot) { // pivot보다 작으면 교환
                    i++;
                    swap(arr, i, j);
                }
            }

            swap(arr, i + 1, right); // pivot을 올바른 위치로 이동
            return i + 1; // pivot의 최종 위치 반환
        }

        // 두 요소를 교환하는 함수
        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void main(String[] args) {
            int[] arr = {3, 1, 4, 1, 5, 9, 2};
            System.out.println("정렬 전: " + Arrays.toString(arr));

            quickSort(arr, 0, arr.length - 1);

            System.out.println("정렬 후: " + Arrays.toString(arr));
        }
    }





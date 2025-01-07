public class BinarySearch {
    static int c = 0;
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            c++;
            int mid = left + (right - left) / 2; // 중간값 계산 (오버플로우 방지)
            System.out.println("중간값 = " + arr[mid]);
            if (arr[mid] == target) {
                return mid; // 값을 찾은 경우
            } else if (arr[mid] < target) {
                left = mid + 1; // 오른쪽으로 탐색 범위 이동
            } else {
                right = mid - 1; // 왼쪽으로 탐색 범위 이동
            }
        }

        return -1; // 값을 찾지 못한 경우
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 13;

        int result = binarySearchIterative(array, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }
        System.out.println(c);
    }
}

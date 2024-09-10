package algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        /**
         * 버블 정렬
         * 인접한 두 요소의 값을 비교하여 마지막 값부터 정렬해나감
         */
        int[] target = { 24, 16, 52, 8, 29, 7};
        int temp = 0;

        /**
         * 오름차순 정렬
         */
        for(int i = 0; i < target.length; i++) { //i = 0~5
            for (int j = 0; j < target.length-1-i; j++) { //j= 0 ~ 4 / 0~3 / 0~2/0~1
                if(target[j]>target[j+1]) {
                    temp = target[j]; //24
                    target[j] = target[j+1]; //16
                    target[j+1] = temp;
                }
            }
        }
        System.out.print("오름차순 정렬 : ");
        for(int answer : target) {
            System.out.print(answer+" ");
        }


        int[] target2 = { 24, 16, 52, 8, 29, 7};

        //내림차순 정렬
        for(int i = 0; i< target2.length; i++) {
            for(int j = 0; j<target2.length-1-i; j++) {
                if (target2[j] < target2[j+1]) {
                    temp = target2[j];
                    target2[j] = target2[j+1];
                    target2[j+1]=temp;
                }
            }
        }
        System.out.print("\n내림차순 정렬 : ");

        for(int answer2 : target2) {
            System.out.print(answer2 + " ");
        }


    }
}

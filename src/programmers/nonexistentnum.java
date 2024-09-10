package programmers;

public class nonexistentnum {
    public static void main(String[] args) {
        int[] numbers = {1,3,4,5,8,6,0};
        int answer = 45; //1부터 9까지 더한 값
        for(int i = 0; i<numbers.length; i++) {
            answer -= numbers[i];
        }
        System.out.println(answer);
    }
}

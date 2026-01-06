import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
                int min = Arrays.stream(arr).min().getAsInt();;

        answer = Arrays.stream(arr)
                .filter(n -> n != min)
                .toArray();

        if(answer.length==0){ answer = new int[]{-1}; }
        return answer;
    }
}
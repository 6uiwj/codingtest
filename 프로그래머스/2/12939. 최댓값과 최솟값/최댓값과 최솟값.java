import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        int[] num = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(num);
        answer = num[0]+ " "+num[num.length-1];
        return answer;
    }
}
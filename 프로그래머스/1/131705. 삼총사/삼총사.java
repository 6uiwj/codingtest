class Solution {
    public int solution(int[] number) {
        int sum = 0;
        int answer = 0;

        for (int i = 0; i < number.length; i++) {
            sum += number[i];
            for(int j = i + 1; j < number.length; j++) {
                sum += number[j];
                for(int k = j + 1; k < number.length; k++) {
                    sum += number[k];

                    if(sum == 0) {
                        answer++;
                    }
                    sum -= number[k];
                }
                sum -= number[j];
            }
            sum = 0;
        }

        return answer;
    }
    
}
class Solution {
    public String solution(int[] food) {
        
        String answer = "";
         StringBuilder left = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            while ( food[i] - 2 >= 0 ) {
                left.append(i);
                food[i] = food[i]-2;
            }
        }
        StringBuilder right = new StringBuilder(left).reverse();

        answer = left.toString() + "0" + right.toString();
        return answer;
    }
}
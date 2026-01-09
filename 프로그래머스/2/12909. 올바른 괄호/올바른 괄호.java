class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int right = 0;
        int left = 0;
        if(s.charAt(0) ==')') {
            answer = false;
        }

        if(s.charAt(s.length()-1) =='(') {
            answer = false;
        }

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) =='(') {
                left++;
            }
            if(s.charAt(i) ==')') {
                right++;
            }

            if(left < right) {
                answer = false;
            }
        }
        
        if(left != right) {
            answer = false;
        }
        return answer;
    }
}
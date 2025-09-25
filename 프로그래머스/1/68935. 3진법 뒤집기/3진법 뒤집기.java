class Solution {
    public int solution(int n) {
        int answer = 0;
        int digit = 3;
        String a = "";

        
    while(n>0) {
            a += n % 3; 
            n = n / 3; 
        }
        
        int p = 0;
        
        for (int i = a.length()-1; i >= 0; i--) {
            answer += (a.charAt(i)-48)*Math.pow(digit,p);
            p++;
        }
        return answer;
    }
}
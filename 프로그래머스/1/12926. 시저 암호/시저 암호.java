class Solution {
    public String solution(String s, int n) {
  String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int after = 0;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                sb.append(ch);
                continue;
            }

            if (ch >= 'A' && ch <= 'Z') {
                after = ch + n;
                after = after <= 90 ? after: after - 26;

            }

            else if (ch >= 'a' && ch <= 'z') {
                after = ch + n; 
                after = after <= 122 ? after: after - 26;
            }

            sb.append((char)after);
        }

        answer = sb.toString();
        return answer;
    }
    
}
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pLong = Long.parseLong(p);
        int pLen = p.length(); 
        for (int i = 0; i < t.length() - pLen + 1; i++) {
            String subT = t.substring(i, i+pLen);
            answer += Long.parseLong(subT) <= pLong ? 1 : 0;
        }
        return answer;
    }
}
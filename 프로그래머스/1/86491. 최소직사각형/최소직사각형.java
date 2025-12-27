class Solution {
    public int solution(int[][] sizes) {
        int[] x = new int[sizes.length];
        int[] y = new int[sizes.length];
        int answer = 0;
        int w = 0;
        int h = 0;

        for (int i = 0; i < sizes.length; i++) {
            x[i] = Math.max(sizes[i][0], sizes[i][1]);
            y[i] = Math.min(sizes[i][0], sizes[i][1]);
        }

        for (int i = 0; i < sizes.length; i++) {
            w = Math.max(w, x[i]);
            h = Math.max(h, y[i]);
        }
        answer = w*h;
        return answer;
    }
}
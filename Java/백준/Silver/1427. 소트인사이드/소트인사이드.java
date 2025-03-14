import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int result = 0;
        int[] digit = new int[10];
        while(true) {
            int N = System.in.read();
            if(N<=32) break;
            digit[N-'0']++;
        }
        StringBuffer sb = new StringBuffer();
        for(int i = digit.length-1; i>=0; i--) {
            for(int j =0; j<digit[i]; j++) {
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}

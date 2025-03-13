import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = readInt(bis);
        int[] sort = new int[10001];
        for(int i = 0; i< n; i++) {
            int temp = readInt(bis);
            sort[temp]++;        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i <= 10000; i++) {
            while(sort[i]!=0) {
                sb.append(i + "\n");
                sort[i]--;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    private static int readInt(BufferedInputStream bis) throws IOException {
        int out = 0;
        boolean isNegative = false;

        while(true) {
            int n = bis.read();
            if(n <= 32) return isNegative ? (-1)*out : out;
            else if(n == '-') isNegative = true;
            else out = (out<<3) + (out<<1) + (n-'0');

        }
    }

}

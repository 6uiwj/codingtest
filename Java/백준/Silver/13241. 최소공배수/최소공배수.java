import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        long a = readInt();
        long b = readInt();
        long aNum = a;
        long bNum = b;
        long k = 2;
        long answer = 1;
        while(k<=aNum || k<=bNum) {
            if(a%k==0 && b%k==0) {
                answer *= k;
                a /= k;
                b /= k;
            } else {
                k++;
            }
        }
        answer = answer * a*b;
        System.out.println(answer);
    }
    static int readInt() throws IOException {
        int out = 0;
        while(true) {
            int n = System.in.read();
            if(n <= 32) return out;
            else out = (out << 3) + (out << 1) + (n-'0');
        }
    }
}

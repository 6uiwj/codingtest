import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int a = readInt();
        int b = readInt();
        int c = readInt();
        int d = readInt();

        int numerator = a*d + b*c; 
        int denominator = b*d; 
        int x = numerator;
        int y = denominator;
        int i = 2;
        while(i <= x && i <= y) {
            if(numerator%i == 0 && (denominator%i) == 0) {
                numerator /= i;
                denominator /= i;
            }
            else i++;
        }
        System.out.println(numerator + " " + denominator);
    }

    static int readInt() throws IOException {
        int out = 0;
        while(true) {
            int n = System.in.read();

            if(n<=32) return out;
            else out = (out << 3) + (out << 1) + (n-'0');
        }
    }
}

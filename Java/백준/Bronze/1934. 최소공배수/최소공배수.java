import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int t  = readInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int a = readInt();
            int b = readInt();
            int max = a;
            int n = 2;
            int multiply = 1;
            if(a == 1 || b == 1 ) {
                sb.append(b).append("\n");
                continue;
            }
            while(n<=max) {
                if (a % n == 0 && b % n == 0) {
                    multiply *= n;
                    a=a/n;
                    b=b/n;
                } else {
                    n++;
                }
            }
            multiply = multiply*a*b;
            sb.append(multiply).append("\n");
        }
        System.out.println(sb);
    }

    static int readInt() throws IOException {
        int out = 0;
        while (true) {
            int n = System.in.read();
            if(n <= 32) return out;
            else out = (out << 3) + (out << 1) + (n-'0');
        }
    }
}

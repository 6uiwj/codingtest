import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int M = readInt();
        StringBuilder sb = new StringBuilder();
        boolean prime = false;
        for(int i = N; i <= M; i++) {
            prime = isPrime(i);
            if(prime) sb.append(i).append("\n");
        }

        System.out.println(sb);

    }

    private static boolean isPrime(int i) {
        if(i==1) return false;
        if(i==2 || i==3 ) return true;
        for(int j = 2; j*j <=i; j++ ) {
            if(i%j!=0) continue;
            else return false;
        }
        return true;
    }

    static int readInt() throws IOException {
        int out = 0;
        while(true) {
            int n = System.in.read();
            if(n <= 32) return out;
            else out = (out << 3) + (out << 1) + (n - '0');
        }
    }
}

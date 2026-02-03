import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        long n = readLong();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< n; i++) {
            long m = readLong();
            sb.append(prime(m)).append("\n");
        }
        System.out.println(sb);


    }

    static long prime (long num) {
        if (num <= 2) return 2;

        if (num % 2 == 0) num++;

        while (true) {
            boolean isPrime = true;
            for (long i = 3; i * i <= num; i += 2) {
                if(num % 2 == 0 || num % 3 == 0) {
                    isPrime = false;
                    break;
                }
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) return num;
            num += 2;
        }
    }

    static long readLong() throws IOException {
        long out = 0;
        while(true) {
            int n = System.in.read();
            if(n <= 32) return out;
            else out = (out << 3 ) + ( out << 1 ) + (n - '0');;
        }
     }
}

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        int a = readInt();
        int b = readInt();
        int count = 0;
        Set<Integer> elements = new HashSet<>();
        for(int i = 0; i<a; i++) {
            elements.add(readInt());
        }

        for(int i =0; i<b; i++) {
            int temp = readInt();
            if(elements.contains(temp)) elements.remove(temp);
            else count++;
        }

        count += elements.size();
        System.out.println(count);

    }

    static int readInt () throws IOException {
        int out = 0;
        while(true) {
            int n = System.in.read();
            if(n <= 32) return out;
            else out = (out<<3) + (out<<1) + (n-'0');
        }
    }
}

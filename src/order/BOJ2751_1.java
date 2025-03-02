package order;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BOJ2751_1 {
    public static void main(String[] args) throws IOException{
        int n = readInt();
        Set<Integer> sortTarget = new TreeSet<>();
        for(int i = 0; i < n; i++) {
            sortTarget.add(readInt());
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> iterator = sortTarget.iterator();


        for(int i = 0; i < n; i++) {
        sb.append(iterator.next() + "\n");
        }
        System.out.println(sb);
    }

    private static int readInt() throws IOException {
        int out = 0;
        boolean isNegative = false;

        while(true) {
            int n = System.in.read();
            if(n <= 32) return isNegative ? (-1)*out : out;
            else if(n == '-') isNegative = true;
            else out = (out<<3) + (out<<1) + (n-'0');

        }
    }

}

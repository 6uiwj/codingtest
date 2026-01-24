import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = readInt();
        Map<Integer,Integer> card = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int number = readInt();
            if(card.containsKey(number)) {
                int temp = card.get(number);
                temp++;
                card.replace(number,temp);
            } else {
                card.put(number, 1);
            }
        }


        int m = readInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            int num = readInt();
            int ans = card.get(num) == null? 0 : card.get(num);
            sb.append(ans).append(" ");
        }
        System.out.println(sb);
    }

    static int readInt() throws IOException {
        int out=0;
        boolean isNegative = false;

        while(true) {
            int n = System.in.read();

            if(n <= 32) return isNegative? (-1)*out : out;
            else if (n=='-') isNegative=true;
            else {
                out = (out <<3) + (out<<1) + (n - '0');
            }
        }
    }
}

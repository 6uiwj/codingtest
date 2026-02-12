import java.io.IOException;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        StringBuilder sb =  new StringBuilder();
        PriorityQueue<Integer> arrays = new PriorityQueue<>((o1, o2) -> {
                    int first = Math.abs(o1);
                    int second = Math.abs(o2);
                    if(first == second) { //절댓값이 같은 경우 음수 우선
                        return o1 > o2 ? 1 : -1; //양수, 음수 리턴
                    }
                    return first - second; //절댓값이 작은 데이터 우선
                });
        for(int i =0; i < N; i++) {
            int input = readInt();
            if(input == 0 ) {
                if(arrays.isEmpty()) sb.append("0").append("\n");
                else sb.append(arrays.poll()).append("\n");
            } else {
                arrays.add(input);
            }
        }
        System.out.println(sb);
    }
    static int readInt() throws IOException {
        int out = 0;
        boolean isNegative = false;
        while(true) {
            int n = System.in.read();

            if( n <= 32 ) return isNegative ? (-1)*out : out;
            else if ( n == '-') isNegative = true;
            else out = ( out << 3) + ( out << 1 ) + (n - '0');
        }
    }
}

import java.awt.Point;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        int n = readInt();
        StringBuilder sb = new StringBuilder();

        Point[] points = new Point[n];
        int x; int y;
        for(int i = 0; i < n; i++){
            x  = readInt();
            y  = readInt();
            points[i] = new Point(x, y);

        }
        
        Arrays.sort(points, (p1, p2) -> {
            if (p1.y != p2.y) {
                return Integer.compare(p1.y, p2.y); 
            }
            return Integer.compare(p1.x, p2.x);     
        });

        for (Point p : points) {
            sb.append(p.x + " " + p.y+"\n");
        }
        
        System.out.println(sb.toString());

    }

    private static int readInt() throws IOException {
        int out = 0;
        boolean negative = false;

        while (true) {
            int n = System.in.read();
            if(n<=32) return negative? (-1)*out:out;
            else if (n == '-') negative = true;
            else out = (out <<3) + (out<<1) + (n-'0');
        }

    }

}

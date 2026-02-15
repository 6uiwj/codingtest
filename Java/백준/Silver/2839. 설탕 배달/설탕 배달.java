import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //18
        int x = 0, y = 0;
        int min = 5000/3;
        for(int i =0; i<=n/5; i++) {
            if ((n - 5 * x) % 3 == 0) { 
                y = (n - 5 * x) / 3; 
                    if (x + y < min) min = x + y;
            }
                x++;
        }
        System.out.println(min==5000/3? -1 : min);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" ");
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);
        int z = Integer.parseInt(a[2]);
        int ans = 0;

        if(x==y && y==z) {
            ans = 10000 + x * 1000;
        } else if(x==y || y==z || z==x) {
            if(x==y) {
                ans = 1000 + x*100;
            } else if (y==z) {
                ans = 1000 + y*100;
            } else {
                ans = 1000 + z*100;
            }
        } else  {
            ans = Math.max(x, Math.max(y,z))*100;
        }

        System.out.println(ans);
    }
}

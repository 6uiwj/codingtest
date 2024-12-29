package ali_mul_prime;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2581 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int ans =0;
        int min = 0;
        while(n-m>=0) {
            int p =0;
            for(int i=1;i<=n;i++) {
                if(n%i==0) p++;
            }
            if(p==2) {
                ans += n;
                min=n;
            }
            n--;
        }
        System.out.println(ans==0? -1: ans+"\n"+min);
    }


}

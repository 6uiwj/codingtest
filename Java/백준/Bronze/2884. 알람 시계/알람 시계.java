import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" ");
        int h = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        if(m>=45) {
            m = m-45;
        } else { 
            m = m-45+60;
            if(h==0) h=23;
            else h= h-1;
        }

        System.out.println(h+" "+m);
    }
}

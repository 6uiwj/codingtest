import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int l = 1;
        int s = 2;
        int i = 0;
        String ans ="";
        while(x>l) {
            l+= s;
            s++;
        }
        i = x-(l- s +1);
                int a= i;
                int b= s - i;
        System.out.println(ans = s %2==0?  b+"/"+a:a+"/"+b);
            }
}

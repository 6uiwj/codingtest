import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" ");
        String b[] = br.readLine().split(" ");
        int cr = 300000;
        int ans = 0;
        int temp =0;
        int n = Integer.parseInt(a[0]); //주어진 카드 개수
        int m = Integer.parseInt(a[1]); //합
        for (int i= 0;i< n - 2; i++ ){
            for (int j=i + 1; j< n -1; j++) {
                for (int k= j + 1; k< n; k++) {
                    ans = Integer.parseInt(b[i])+ Integer.parseInt(b[j])+ Integer.parseInt(b[k]);
                    if(m-ans >= 0 && m-ans < cr){
                        cr = m - ans;
                        temp = ans;
                    }
                }
            }
        }
        System.out.println(temp);

    }
}

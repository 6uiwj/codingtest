import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" "); //현재 시각
        int b = Integer.parseInt(br.readLine()); //요리 시간

        int cH = Integer.parseInt(a[0]); //현재 시 
        int cM = Integer.parseInt(a[1]); //현재 분

        int eM = cM + b;  //eM: 종료 분
        int eH = cH; //eH: 종료 시
        
        if(eM>=60) {
            eH += eM/60;
            eM = eM%60;
        }

        if(eH>23) eH = eH%24;

        System.out.println(eH + " " + eM);
    }
}

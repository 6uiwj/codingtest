package programmers;

public class collatz {
    public static void main(String[] args) {
        int a = 626331;
        int b=0;
        while(a!=1) {
            a = a%2==0 ? a/2 : a*3+1;
            b++;
        }
        if(b>500) {
            b = -1;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}

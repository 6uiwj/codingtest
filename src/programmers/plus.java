package programmers;

public class plus {
    public static void main(String[] args) {
        int[] absolutes = {1, 5, 23, 16};
        boolean[] sign = {true, false, false, true};

        int a = 0;
        int sum=0;
        for(int i = 0 ; i < absolutes.length; i++) {
            a = sign[i]==true? 1 : -1;
            sum += absolutes[i]*a;
        }
        System.out.println("sum = " + sum);
    }
}

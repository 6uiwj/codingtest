package programmers;

public class hashard {
    public static void main(String[] args) {
        int x = 27;
        int temp = 0;
        boolean answer = true;
        String y = String.valueOf(x);
        for(int i = 0; i<y.length(); i++) {
            //temp += Integer.parseInt(String.valueOf(y.charAt(i)));
            temp += y.charAt(i)-'0';
        }
        System.out.println(temp);
        answer = x%temp == 0 ? true : false;
        System.out.println("answer = " + answer);
    }
}

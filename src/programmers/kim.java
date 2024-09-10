package programmers;

public class kim {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim", "Shin", "Jeong", "Lee", "Park"};
        String b = "";
        int a = seoul.length;
        for(int i = 0; i < a; i++ ) {
            if(seoul[i].equals("Kim")) {
                b="김서방은 "+i+"에 있다";
                System.out.println(b);
            }
        }
    }
}

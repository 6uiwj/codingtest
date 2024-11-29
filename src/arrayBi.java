import java.util.Scanner;

public class arrayBi {
    public static void main(String[] args) {

        int[][] score = new int[4][3]; //학생별 과목별 받을 점수 (4명 X 3과목)
        String[] subject = {"국어", "수학", "영어"}; //과목 종류
        int[][] totalScore = new int[score.length][2]; //총점과 평균을 넣어줄 공간 (4명 X 2(총점, 평균))

        Scanner scanner = new Scanner(System.in);

        //점수 입력받기
        for(int i= 0 ; i<score.length; i++) {
            System.out.println(i+1+"번 학생의 점수를 입력하세요 : ");
            for(int j = 0; j<score[0].length; j++) {
                System.out.println(subject[j]+"점수 : ");
                score[i][j]=scanner.nextInt();
            }
        }
        //총점 구하기
        for(int i = 0; i< totalScore.length; i++) {
            for(int k=0; k<totalScore[i].length; k++) {
                for (int j = 0; j < score[i].length; j++) {
                    totalScore[i][k] += score[i][j];
                }
            }
        }
        //총점과 평균 출력
        for(int i = 0; i< totalScore.length; i++) { //1234
            for(int j =0; j<totalScore[i].length; j++) {//12
                if(j%2==0) {
                    System.out.println(i + 1 + "번 학생 총점 : " + totalScore[i][j]);
                } else {
                    System.out.println(i + 1 + "번 학생 평균 : " + totalScore[i][j]/subject.length);
                }
            }
        }
    }
}

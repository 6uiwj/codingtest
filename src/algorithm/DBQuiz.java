package algorithm;

import java.util.Scanner;

public class DBQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("'회원' 테이블을 생성, 회원코드 속성 숫자20자에 기본키 / " +
                "회원명 30글자 null안됨 / 성별 10글자에 F,M중 하나 들어가게 / 나이 속성 숫자 5자에 기본값 0," +
                "/ 회원카드번호 숫자30 고유값을 갖도록 지정 , 회원분류 숫자20 외래키, 수강과목 테이블의 수강번호 참조, 연쇄삭제 기능과 수정제한기능");
        scanner.nextLine();

        System.out.println("index 생성, 인덱스이름은 index_01이고 회원테이블의 회원명과 회원카드번호 이용, 회원카드번호 오름차순");
        scanner.nextLine();

        System.out.println("view 생성: view_01뷰 이름으로 지정하고 회원 테이블의 회원명, 나이, 성별 가져오는데, 회원성별이 M인것만 가져옴");
        scanner.nextLine();

        System.out.println("트리거 생성, 트리거이름은 trigger_새트리거, ");
        scanner.nextLine();

        System.out.println("회원 테이블 삭제");
        scanner.nextLine();
        System.out.println("view_01 뷰 삭제");
        scanner.nextLine();
        System.out.println("index_01 인덱스 삭제");
        scanner.nextLine();

        System.out.println("회원테이블에 ADDR 속성 추가");
        scanner.nextLine();

        System.out.println("회원 테이블에서 AGE 속성 INT로 변경");
        scanner.nextLine();

        System.out.println("회원 테이블에서 AGE 속성 삭제");
        scanner.nextLine();

        System.out.println("회원명 index를 성명으로 변경");
        scanner.nextLine();

        System.out.println("회원 테이블 내용 삭제 ");
        scanner.nextLine();

        System.out.println("테이블 student에 대한 select, insert 권한을 kim과 lee에게 부여");
        scanner.nextLine();

        System.out.println("테이블 student에 대한 select, insert 권한을  lee한테서 회수");
        scanner.nextLine();

        System.out.println("student 릴레이션에 대한 select권한을 모든 사용자에게 허가");
        scanner.nextLine();

        System.out.println("user1에게 t1테이블에 대한 select 권한과 다른사용자에게 부여할 수있는 권한 부여");
        scanner.nextLine();

        System.out.println("user1에게서 t1테이블에 대한 select권한과 연결된 부여 전부 회수");
        scanner.nextLine();

        System.out.println("EMP테이블 user_no, user_name 컬럼에 각각 " +
                "001, user1 을 삽입");
        scanner.nextLine();

        System.out.println("주소록 테이블에서 거래처번호가 NULL이 아닌 레코드를 모두 거래처 테이블에 삽입");
        scanner.nextLine();

        System.out.println("EMP 테이블 USER_NO가 1000인 고객의 USER_NAME을 '이흥직', AGE를 45로 변경");
        scanner.nextLine();

        System.out.println("학생 테이블에서 이름이 홍길동, 나이가 17인 학생의 학년을 3으로 수정");
    }
}

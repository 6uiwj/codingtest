package algorithm;

import java.util.*;

import static java.lang.Math.floor;

public class DPQuiz {
    public static void main(String[] args) {
        Map quiz = new HashMap();
        quiz.put("서로 관련된 객체들의 조합을 생성하기 위한 인터페이스를 제공하는 패턴으로, 구체적 클래스 명시없이 객체 생성 가능한 패턴","추상 팩토리(Abstract Factory)");
        quiz.put("복잡한 객체의 생성 과정을 여러단계로 나누어 처리하는 패턴으로, 객체 생성이 복잡할 때 사용하는 패턴","빌더(Builder)");
        quiz.put("객체 생성을 처리하는 인터페이스를 제공하고, 실제 객체의 생성은 서브클래스가 결정하는 패턴으로, Virtual-Constructor라고도 하는 패턴","팩토리 메서드(Factory Method)");
        quiz.put("기존 객체를 복제함으로써 새로운 객체를 생성하는 패턴","프로토타입(Prototype)");
        quiz.put("객체의 인스턴스가 오직 하나만 생성되는 패턴","싱글톤(Singleton)");
        quiz.put("호환되지 않는 인터페이스를 가진 클래스들이 함께 작동하도록 도와주는 패턴","Adaptor");
        quiz.put("추상부와 구현부를 분리하여 두 계층이 독립적으로 변화가 가능한 패턴","브릿지(Bridge)");
        quiz.put("트리구조로 구성된 패턴","컴포지트(Composite)");
        quiz.put("객체에 동적으로 새로운 기능을 추가할 수 있고, 코드의 수정없이 객체기능을 확장할 수 있는 패턴","데코레이터(Decorator)");
        quiz.put("복잡한 시스템을 단순화할 수 있고, 클라이언트는 단일 인터페이스만 사용하고 내부 구현을 숨기는 패턴","퍼샤드(Facade)");
        quiz.put("객체를 공유하여 메모리를 절약할 수 있는 패턴","플라이웨이트(Flyweight)");
        quiz.put("다른 객체에 대한 접근을 제어하고 중개하는 패턴으로, 대리인과 대변자 역할을 하는 패턴","프록시(Proxy)");
        quiz.put("요청을 처리하는 객체들을 사슬 형태로 연결하며, 요청 처리 가능 여부를 판단하여 처리 불가시 다음 객체에 전달하는 패턴","Chain of Responsibility");
        quiz.put("요청을 객체로 캡슐화하여 요청자와 처리자를 분리하고, 명령, 요청자, 클라이언트, 수신자로 구분하는 패턴","Command");
        quiz.put("문법 규칙을 기반으로 문장을 해석하고, 프로그래밍 언어의 문법을 해석하는 데 사용되는 패턴","인터프리터(Interpreter)");
        quiz.put("컬렉션 요소들을 순차적으로 접근, 처리하는 패턴","Iterator");
        quiz.put("여러 객체 간의 상호작용을 중앙집중식으로 관리하는 패턴으로, 중재자를 두고, 메시지를 캡슐화하여 주고받으며 협력하는 패턴","Mediator");
        quiz.put("객체의 이전 상태를 저장하고 복원하는 패턴","메멘토(Memento)");
        quiz.put("객체의 상태 변화를 관찰하여 변화가 생기면 다른 객체에게 자동으로 알리는 패턴","옵저버(Observer)");
        quiz.put("객체의 내부 상태에 따라 동작을 변경하는 패턴","상태(State)");
        quiz.put("알고리즘을 객체로 캡슐화하고, 알고리즘을 선택하고 실행하는 방법을 제공하는 패턴","Strategy");
        quiz.put("알고리즘의 핵심적 골격은 유지하고, 일부 단계는 하위 클래스에서 구체적으로 구현하는 패턴","Template Method");
        quiz.put("객체의 구조를 변경하지 않고 객체에 새로운 연산을 추가할 수 있는 패턴으로 구조로부터 처리 기능을 분리할 수 있는 패턴","Visitor");

        int size = quiz.size(); //3
        List<String > keyList = new ArrayList<>(quiz.keySet());
        int randNum = 0;
        String subject = "디자인 패턴";
        System.out.println(subject+"에 관한 퀴즈 프로그램입니다. 풀어볼 퀴즈 수를 숫자로 입력해주세요. " +
                "총 문제 수는 "+quiz.size()+"문제입니다.");
        Scanner scanner = new Scanner(System.in);

        int quizNum = scanner.nextInt();
        int temp[] = new int[quizNum];
        scanner.nextLine();
        System.out.println("퀴즈를 시작합니다. \n");
        for(int i = 0; i<quizNum; i++) {
            randNum = (int)floor(Math.random()*size);
            temp[i]=randNum;
            int count = i;
            for(int j=0;j<i;j++) {
                if (i != 0 && temp[i] == temp[j]) {
                    i--;
                    continue;
                }
            }
            if (count != i) continue;
            String question = keyList.get(randNum);
            System.out.print(i+1+". ");
            System.out.println(question + "은(는) 무엇인가요?");

            scanner.nextLine();

            System.out.println("정답은 \"" + quiz.get(question) + "\" 입니다.\n");
        }
        System.out.println("퀴즈를 종료합니다.");
    }
}

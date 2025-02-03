package algorithm;

import java.util.*;

import static java.lang.Math.*;

public class Quiz {
    public static void main(String[] args) {
        Map quiz = new HashMap();
        quiz.put("네트워크를 통해 자신을 복제하고 전파할 수 있는 독립적인 악성 프로그램","웜");
        quiz.put("파일, 부트 섹터, 메모리 영역 등에서 자신을 복제하는 악성 프로그램","바이러스");
        quiz.put("겉으로는 해를 끼치지 않는 것처럼 보이지만, 실제로는 바이러스나 기타 위험 요소를 숨기고 있는 악성 프로그램","트로이목마");
        quiz.put("단순히 PC를 감염시키는 것이 아니라 공항, 발전소, 철도 등 기간시설을 파괴하는 등 물리적인 피해를 입힐 목적으로 제작된 컴퓨터 바이러스","스턱스넷(Stuxnet)");
        quiz.put("핸드폰 운영체제의 루트(Root) 관리자 계정을 획득하는 것", "루팅(Rooting)");
        quiz.put("시스템에 전반적으로 접근할 수 있는 루트 권한을 쉽게 얻게 해주는 킷(Kit)","루트킷(RootKit)");
        quiz.put("가짜 바이러스 또는 거짓 정보로, 사용자를 속이거나 장난을 치는 것이 목적인 것","혹스(Hoax)");
        quiz.put("네트워크를 통해 전송되는 데이터 패킷을 도청하는 공격","스니핑 공격(Sniffing Attack)");
        quiz.put("공격자가 자신의 IP주소를 다른 주소로 위장하여 접속하는 공격 방식", "IP Spoofing");
        quiz.put("ARP 프로토콜의 취약점을 이용하여 공격자의 MAC 주소를 다른 컴퓨터의 것으로 위장하는 공격", "ARP Spoofing");
        quiz.put("DNS 질의를 가로채 변조된 결과를 반환하는 중간자 공격의 일종", "DNS Spoofing");
        quiz.put("사용자의 컴퓨터를 악성코드에 감염시켜, 정상적인 웹 사이트 접속 시도 시 피싱사이트로 유도하는 공격", "파밍(Phaming)");
        quiz.put("사용자가 웹 사이트의 URL을 잘못 입력하는 실수를 이용한 공격 방법으로, 실수로 접속한 유사한 URL의 사이트를 통해 민감한" +
                " 정보를 획득하거나 악성코드를 설치하려는 의도를 가지는 공격 방법", "타이포스쿼팅(Typosquatting)");
        quiz.put("문자 메시지를 이용해 개인 정보를 빼내는 피싱 공격","스미싱(Smishing=SMS phishing)");
        quiz.put("QR코드를 이용하여 사용자를 악성 링크로 유도하거나 직접 악성코드를 심는 금융 범죄 기법","Qshing");
        quiz.put("서버에 열려 있는 포트를 탐색하고 해당 포트의 취약점을 이용한 공격","포트 스캐닝(Port Scanning");
        quiz.put("이미 인증 받고 세션을 유지하는 연결을 빼앗는 공격","세션 하이재킹(Session Hijacking)");
        quiz.put("프로그램 실행 시 입력 값이 버퍼를 초과하여 메모리를 침범하는 현상이나 이를 이용한 공격 방법","버퍼 오버플로우(Buffer Overflow)");
        quiz.put("문자열 출력 포맷의 애매모호한 설정을 이용해 메모리의 RET 위치에 악성코드 주소를 입력하여 공격하는 기법", "Format String Attack");
        quiz.put("클라이언트의 입력 값을 조작하여 서버의 데이터베이스를 공격하는 기법","SQL Injection");
        quiz.put("악의적인 사용자가 타 사이트에 스크립트를 삽입하여 사용자의 쿠키 정보나 세션을 탈취하는 공격","XSS(Cross-Cite Scripting)");
        quiz.put("사용자가 자신의 의지와 무관하게 공격자가 의도한 행위를 특정 웹 사이트에 요청하도록 만드는 해킹 공격","CSRF(Cross-Site Request Forgery)");
        quiz.put("정상적인 인증 절차 없이 시스템에 접근할 수 있게 하는 프로그램","Backdoor");
        quiz.put("다양한 도구를 이용해 시스템의 비밀번호를 알아내는 공격 기법","Password Cracking");
        quiz.put("다양한 해시 함수를 이용하여 생성 가능한 값들을 대량으로 저장한 테이블","Rainbow Table");
        quiz.put("지속적이고 체계적인 해킹공격, 고도로 조직화된 공격자 그룹이 특정 대상에 대해 장기간에 걸쳐 은밀하게 수행하는 사이버 공격 방법","APT");
        quiz.put("특정 IP주소에 대량의 패킷을 보내 인터넷 접속을 끊는 크래킹의 한 형태","Nucking");
        quiz.put("암호 알고리즘을 대상으로 한 물리적 공격 기법","부채널 공격(Side Channel Attack");
        quiz.put("무차별 대입 공격으로, 가능한 모든 문자열 조합을 시도하여 공격","Brute Force");
        quiz.put("사전에 정의된 일반적으로 사용되는 패스워드 패턴을 이용한 공격 방식","Dictionary Attack");
        quiz.put("사용자의 키보드 입력을 기록하여 개인 정보를 훔치는 공격","Key Logger Attack");
        quiz.put("사용자 동의 없이 사용자 정보를 수집하는 프로그램","스파이웨어");
        quiz.put("프로그램 실행 중에 광고를 보여주는 소프트웨어로, 사용자가 광고를 본 대가로 프로그램 비용을 대신 지불","애드웨어");
        quiz.put("사용자의 시스템 작업을 추적하고 정보를 수집하여 다른 조직에 전달하는 소프트웨어","트랙웨어");
        quiz.put("사용자 동의를 얻어 설치되지만, 사용자에게 불편을 주는 일종의 악성 소프트웨어","그레이웨어");
        quiz.put("불법 온라인 활동을 용이하게 하는 소프트웨어로, 스파이웨어, 키로거, 금융 정보 탈취 등을 위해 사용","크라임웨어(Crimeware)");
        quiz.put("시스템 접근을 제한하고 사용자에게 몸값을 요구하는 악성 소프트웨어", "랜섬웨어");
        quiz.put("아직 알려지지 않은 소프트웨어 취약점을 이용한 공격","제로데이 공격");
        quiz.put("기술적인 방법이 아닌 사람들 간의 기본적인 신뢰를 기반으로 사람을 속여 비밀정보를 획득하는 기법", "사회공학(Social Engineering)");
        quiz.put("가짜 WiFi AP를 구축하여 사용자 정보를 중간에서 가로채는 공격","Evil Twin Attack");
        quiz.put("블루투스 연결 취약점을 이용한 공격","Bluebug");
        quiz.put("블루투스 취약점을 이용해 장비의 파일에 접근하는 공격","BlueSnarf");
        quiz.put("블루투스 장비를 탐색하는 활동","BluePrinting");
        quiz.put("개인이 특정 반경 내에서 Bluetooth 지원 장치로 익명 메시지를 보낼 수 있는 해킹 방법","BlueJacking");
        quiz.put("위조된 MAC 주소를 이용해 네트워크 스위치를 혼란시키는 공격","Switch Jamming");
        quiz.put("공격자를 유인하기 위해 의도적으로 설치된 시스템","HoneyPot");
        quiz.put("원격 데스크톱 서비스의 취약점을 이용한 공격","블루킵(Bluekeep)");
        quiz.put("잘못된 정보나 소문이 빠르게 확산되어 대중의 두려움을 증폭시키는 현상","Infodemics");
        quiz.put("금융기관이나 인터넷에서 작은 금액을 조금씩 뺴내는 기법","살라미(Salami)");
        quiz.put("수집되었지만 분석되지 않고 저장만 되어 있는 대량의 데이터","다크 데이터");
        quiz.put("분실한 정보기기의 데이터를 원격으로 삭제하고 사용을 중지시키는 기능","킬 스위치");
        quiz.put("중요 정보를 보호하기 위해 별도의 독립적인 보안 구역을 두는 하드웨어 기반의 보안 기술","트러스트존(TrustZone)");

        int size = quiz.size(); //Map에 퀴즈 목록을 담고, 이 Map의 크기를 가져옴
        List<String > keyList = new ArrayList<>(quiz.keySet()); //Map에서 키만 가져와 list에 담음
        int randNum = 0;
        String subject = "해킹 기법"; //퀴즈 주제
        System.out.println(subject+"에 관한 퀴즈 프로그램입니다. 풀어볼 퀴즈 수를 숫자로 입력해주세요. " +
                "총 문제 수는 "+quiz.size()+"문제입니다."); //안내 comment
        Scanner scanner = new Scanner(System.in);
        int quizNum = scanner.nextInt(); //풀 퀴즈 수

        int temp[] = new int[quizNum];
        scanner.nextLine();
        System.out.println("퀴즈를 시작합니다. \n");

        //랜덤하게 문제 출제하기 (Map으로 문제와 정답을 미리 저장해 둠)
        for(int i = 0; i < quizNum; i++) {
            randNum = (int)floor(Math.random()*size); //퀴즈 개수만큼 랜덤한 숫자 뽑기
            temp[i] = randNum; //중복 방지 - temp 배열에 랜덤 숫자를 넣기
            int count = i; //현재 문제의 index 기록

            for(int j = 0; j < i; j++) { //이전 출제된 문제에 동일한 문제가 있는지 확인
                if (i != 0 && temp[i] == temp[j]) {
                    i--; //동일한 문제가 있다면 다시 랜덤으로 문제 고르러 감!!
                    continue;
                }
            }
            if (count != i) continue;
            String question = keyList.get(randNum); //문제 가져오기
            System.out.print(i+1 + ". "); //문제 번호
            System.out.println(question + "은(는) 무엇인가요?"); //문제 출력

            scanner.nextLine();
            System.out.println("정답은 \"" + quiz.get(question) + "\" 입니다.\n");
        }
        System.out.println("퀴즈를 종료합니다.");

    }
}

package temp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tag {
    public static void main(String[] args) throws IOException {
        List<String> htmlTag = new ArrayList<String>();
        String temp = "";
        List<String> tag = new ArrayList<String>();
        int index = 0;
        int count = 0;
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\USER\\Desktop\\test.txt"));


        while (true) { //파일에서 한줄씩 읽어오기
            String line = br.readLine();
            if (line != null) {
                if (line.trim().isEmpty()) continue;
                line = line.trim();
                htmlTag.add(line);

            }
            if (line == null) break;
        }

//OK
//        for(String no : htmlTag) {
//            System.out.println(no);
//        }


        for (int i = 0; i < htmlTag.size(); i++) { //각 줄마다 "2번째 글자부터 알파벳소문자가 마지막으로 나오는 곳까지 출력
            if(htmlTag.get(i).length()==1) continue; //한글자면 스킵
            //if(htmlTag.get(i).charAt(1)=='/') continue;
            if(htmlTag.get(i).charAt(0)=='<') { //'<'로 시작하는 문장 중에서
            try {
                Pattern pattern = Pattern.compile("[^a-z]");
                Matcher matcher = pattern.matcher(htmlTag.get(i));
                while(matcher.find()) { //두번쨰로 알파벳이 아닌 문자가 나오면 멈춤
                    count++;
                    if (count == 2) {
                        index = matcher.start();
                        break;
                    }
                }
                if(index != -1) {
                    int a = htmlTag.get(i).charAt(index);
                    temp = htmlTag.get(i).substring(1, a);
                    System.out.println("아 :" +  temp);
                }

            } catch (StringIndexOutOfBoundsException e) {
            }
            tag.add(temp);

        }
        }



            Set<String> answer = new HashSet<>(tag);

        List<String> htmlList = answer.stream().toList();
        int[] htmlCount = new int[answer.size()];

        //       Iterator<String> iterator = answer.iterator();
//            while(iterator.hasNext()) {
//                String str = iterator.next();
//                for (int j = 0; j < tag.size(); j++) {
//                    if(tag.get(j).equals(iterator)) {
//
//                    }
//                }
//            }

        for(int i = 0; i<htmlList.size(); i++) { //a, b, c
            for(int j = 0; j < tag.size(); j++) { //a, b, c, a, b, d
                if(htmlList.get(i).equals(tag.get(j))) {
                    htmlCount[i]+=1;
                }
            }
        }

        System.out.print("https://www.sepoasoft.co.kr/ 에 포함된 태그 종류는 ");

        System.out.println("총 "+answer.size()+"개 입니다.");
            for (String result : answer) {
                System.out.println(result);
            }

        System.out.println("각 태그의 개수는 ");
            for(int i = 0; i<htmlList.size(); i++) {
                System.out.println(htmlList.get(i)+" : " + htmlCount[i]+"개");
               // System.out.println(tag.get(i));
            }


    }
}

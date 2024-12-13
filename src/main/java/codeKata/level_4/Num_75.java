package codeKata.level_4;

import java.util.Arrays;
import java.util.stream.Collectors;


// JadenCase 문자 만들기
public class Num_75 {

    public static void main(String[] args) {

        String s = "3people unFollowed me";
//        solution(s);
        solution2(s);
    }

    private static String solution2(String s) {
        String answer = "";
        String[] array = s.toLowerCase().split("");  //  모두 소문자로 만들기
        boolean flag = true;

        for (String str: array) {
            answer += flag ? str.toUpperCase() : str;
            flag = str.equals(" ");  // 같다면 true로 변하고, 다음으로 넘어가서 삼항식에서 true일때는 그다음 문자가 대문자로 바뀐다.
            // 같지 않다면 false로 변하고, 다음으로 넘어가서 삼항식에서 그다음 문자는 false일때로 적용이 된다.
        }

        System.out.println(answer);
        return answer;
    }

    // 다른 풀이
    private static String solution3(String s){
        String answer = "";
        boolean wasSpace = true;
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                sb.append(" ");
                wasSpace = true;
                continue;
            }
            else{
                if(wasSpace && Character.isDigit(s.charAt(i)) == false){
                    sb.append((s.charAt(i) + "").toUpperCase());
                }
                else if(!wasSpace){
                    sb.append((s.charAt(i) + "").toLowerCase());
                }
                else{
                    sb.append(s.charAt(i));
                }
                wasSpace = false;
            }
        }
        return sb.toString();
    }
    // 런타임 에러
    public static String solution(String s) {
        String answer = Arrays.stream(s.split(" "))
            .map(word -> word.substring(0, 1).toUpperCase()+ word.substring(1).toLowerCase())
            // substring(0, 1) index 0부터 1 미만까지 즉 인덱스 0번째 값
            // substring(1) index 1부터 시작, 이전은 삭제
            .collect(Collectors.joining(" "));
        // Collectors.joining() 스트림의 요소들을 하나의 문자열로 연결 // 문자 구분 기호는 " " 로

        System.out.println(answer);
        return answer;
    }

}

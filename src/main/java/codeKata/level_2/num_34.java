package codeKata.level_2;

import java.util.Arrays;

//문자열 내림차순으로 배치하기
//    문제 설명
//    문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
//    s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
public class num_34 {

    public class ReverseStr {
        public String reverseStr(String s) {
            String answer = "";
            String[] strARr = s.split("");
//            StringBuffer stringBuffer = new StringBuffer(s);
//            stringBuffer.reverse();
//            answer = String.valueOf(stringBuffer);

            // 오름차순으로 정렬
            Arrays.sort(strARr);
            StringBuilder stringBuilder = new StringBuilder();
            for (String str:strARr) {
                stringBuilder.append(str);
            }

            // 내림차순으로 정렬
            answer = String.valueOf(stringBuilder.reverse());
            return answer;
        }
    }
}
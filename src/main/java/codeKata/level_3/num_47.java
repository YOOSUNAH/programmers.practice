package codeKata.level_3;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
import java.util.*;  // import 기본적으로 해두자

//문자열 내 마음대로 정렬하기
//문제 설명
//문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
// 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
public class num_47 {
    class Solution {
        public String[] solution(String[] strings, int n) {
            String[] answer = new String[strings.length];  // 배열은 크기 지정 잊지말자
            List<String> strList = new ArrayList<>();
            for (int i = 0; i < strings.length; i++) {
                strList.add(strings[i].charAt(n) + strings[i]);
            }
            Collections.sort(strList);
            for (int i = 0; i < strList.size(); i++) {
                answer[i] = strList.get(i).substring(1);  // list는 .get, .add인것!
            }
                return answer;
            }
        }
    }

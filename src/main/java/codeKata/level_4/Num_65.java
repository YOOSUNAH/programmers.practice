package codeKata.level_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 문자열 나누기
public class Num_65 {

    public static void main(String[] args) {
        String ss = "aaabbaccccabba";
        String s = "banana";
        String sss = "abracadabra";

        solution(sss);
    }

    public static int solution(String s) {
      int answer = 1;
      char x = s.charAt(0);
      int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (count == 0){
                answer++;
                x = s.charAt(i);   // 그다음 i인, 2 인 n이 x가 된다.
            }
            if(s.charAt(i) == x){ // i는 계속 증가 예정
                // s.charat0 b 일때, s,chartat1 a   다르니깐 count --  count 0이 되었으니깐
                count++;
            }else count--;
        }
        return answer;
    }
}


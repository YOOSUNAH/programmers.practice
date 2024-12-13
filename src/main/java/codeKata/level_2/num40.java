package codeKata.level_2;

import java.util.ArrayList;
import java.util.List;

//3진법 뒤집기
//문제 설명
//자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
public class num40 {
    class Solution {
        public int solution(int n) {
            String str = "";
            // 3진법으로 변환
            while(n != 0) {
                str += n%3;
                n /= 3;
            }
            // 3진법을 10진법으로 변환
            return Integer.parseInt(str, 3);
        }
    }
}

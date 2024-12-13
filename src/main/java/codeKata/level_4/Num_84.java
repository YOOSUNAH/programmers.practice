package codeKata.level_4;

import java.util.Stack;

//괄호 회전하기
public class Num_84 {

    public static void main(String[] args) {
//        String s = "[](){}";
        String s2 = "}]()[{";
        String s3 = "[)(]";
//        solution(s);
        solution(s2);
        solution(s3);
    }

    public static int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            // 왼쪽으로 i칸씩 회전
            String str = s.substring(i, s.length()) + s.substring(0, i);

            // 닫히는 기호가 들어오면 stack.peek() 으로 이전 기호가 열린 기호인지 확인해서
            // pop
            //stack이 비어있다면 push
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(stack.isEmpty()){
                    stack.push(c);
                } else if (c == ')' && stack.peek() == '(') { // ) 이게 오면, 이전 기호가 ( 이거인지 확인
                    // 맞다면 이전에 담긴 ( 삭제
                    stack.pop();
                }else if (c == ']' && stack.peek() == '[') { // ] 이게 오면, 이전 기호가 [ 이거인지 확인
                    // 맞다면 이전에 담긴 [ 삭제
                    stack.pop();
                }else if (c == '}' && stack.peek() == '{') { // } 이게 오면, 이전 기호가 { 이거인지 확인
                    // 맞다면 이전에 담긴 { 삭제
                    stack.pop();
                }else{
                    // 아니라면, 저장
                    stack.push(c);
                }
            }
            if (stack.isEmpty()) {  // 오바른 괄호 문자열이면, 다 짝지어서 사라짐
                answer++;
            }
        }
        return answer;
    }
}

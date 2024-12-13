package Problem;


import java.util.*;
/*
 * 
 * 
 */

public class greedy_3_큰수만들기 {
    public static void main(String[] args) {
        String number = "4177252841";
        int k = 4;

        System.out.println(solution_greedy(number, k));
    }

    public static String solution_greedy(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int len = number.length();
        
        for (int i = 0; i < len; i++) {
            char current = number.charAt(i);
            
            // 스택이 비어있지 않고, 제거할 수 있는 횟수(k)가 남아 있으며, 스택의 마지막 값이 현재 값보다 작으면 제거
            while (!stack.isEmpty() && k > 0 && stack.peek() < current) {
                stack.pop();
                k--;
            }
            
            stack.push(current);  // 현재 숫자를 스택에 넣음
        }

        // 아직 제거해야 할 숫자가 남아 있으면 뒤에서부터 제거
        while (k > 0) {
            stack.pop();
            k--;
        }

        // 스택에 남은 숫자를 문자열로 변환하여 결과 반환
        StringBuilder answer = new StringBuilder();
        for (char ch : stack) {
            answer.append(ch);
        }

        return answer.toString();
    }
}
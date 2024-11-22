package Problem.gredy;

import java.util.Stack;
import java.util.stream.Collectors;

public class greedy_3_큰수만들기 {
    public static void main(String[] args) {
        String number1 = "1924";
        int k1 = 2;
        String number = "4177252841";
        int k = 4;

        System.out.println(solution_greedy(number1, k1));

        System.out.println(solution_greedy(number, k));
    }

    public static String solution_greedy(String number, int k) {
        Stack<Character> numStack = new Stack<>();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {

            char current = number.charAt(i);

            // 스택이 비어있으면 안됨!
            // 제거할 수 있는 횟수(k)를 다 쓸때까지
            // 스택의 마지막 값이 현재 값보다 작으면 제거
            while (!numStack.isEmpty() && k > 0 && numStack.peek() < current) {
                    numStack.pop();
                    k--;
            }
            numStack.push(current);
        }


        // 아직 제거해야 할 숫자가 남아 있으면 뒤에서부터 제거
        while (k > 0) {
            numStack.pop();
            k--;
        }

        for (Character c : numStack) {
            answer.append(c);
        }
//        answer.append(numStack.stream().map(String::valueOf).collect(Collectors.joining()));

        return answer.toString();
    }
}


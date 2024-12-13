package Problem;

import java.util.Stack;

//"()()" 또는 "(())()" 는 올바른 괄호입니다.
//")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
public class Stack_Queue_1 {

        boolean solution(String s) {

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') {
                    stack.push('(');
                }else if (s.charAt(i) == ')'){
                    if(stack.isEmpty()){
                        return false;
                    }
                    stack.pop();
                }
            }
            return stack.isEmpty();
        }
}

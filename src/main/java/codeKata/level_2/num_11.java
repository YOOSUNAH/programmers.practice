package codeKata.level_2;
// 짝수와 홀수
public class num_11 {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0){
            answer = "Even";
        }
        else answer = "Odd";
        return answer;
    }
}

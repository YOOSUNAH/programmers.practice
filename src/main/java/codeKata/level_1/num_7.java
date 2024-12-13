package codeKata.level_1;
// 두 수의 나눗셈
public class num_7 {

    public int solution(int num1, int num2) {
        int answer = 0;
        double account = ((double) num1 / (double) num2) * 1000;
        answer = (int) account;
        return answer;
    }
}

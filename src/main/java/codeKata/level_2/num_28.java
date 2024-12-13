package codeKata.level_2;

import java.util.ArrayList;
import java.util.List;

// 없는 숫자 더하기
// 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
// numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
public class num_28 {
    public int solution(int[] numbers) {
        int answer = 0;

        List<Integer> noNumList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            noNumList.add(i);
        }
        for (int s : noNumList) {
            answer += s;
        }
        for (int j : numbers) {
            answer -= j;
        }
        return answer;
    }
}


package codeKata.level_3;

import java.util.*;
// 가장 가까운 같은 글자
public class num_50 {
    public int[] solution(String s) {  // banana
        String[] splitS = s.split("");  // b, a, n, a, n, a
       int[] answer = new int[splitS.length];
        // 첫 문자는 무조건 같은게 없으니 -1
        answer[0] = -1;
        for (int i = 1; i < splitS.length; i++) {
            for (int j = i - 1; j >= 0; j--) {  // i =3 일 때, 2,1,0번째 값을 비교
                if (splitS[i].equals(splitS[j])) {
                    answer[i] = i - j;
                    break;
                }else answer[i] = -1;
            }
        }
        return answer;
    }
}

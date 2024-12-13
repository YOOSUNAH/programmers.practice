package Problem.num_1_100.num_71_80;

import java.util.ArrayList;
import java.util.List;

public class num_77_saveArrayAfterCut {
    public static void main(String[] args) {

        String str = "abc1Addfggg4556b";
        int n = 6;
        Solution.solution(str, n);
    }

}

class Solution {
    public static String[] solution(String my_str, int n) {
        int len = 0;
        if (my_str.length() % n == 0) {
            len = my_str.length() / n;    // my_str이 n으로 딱 떨어지면 answer 배열의 크기도 딱 맞지만
        } else {
            len = (my_str.length() / n) + 1; // my_str이 n으로 딱 떨어지지 않으면, 몫에 +1 해줘서 크기를 맞게 설정한다.
        }

        String[] answer = new String[len];
        for (int i = 0; i < len; i++) {
            if (my_str.length() >= n) {
                answer[i] = my_str.substring(0, n);   // 0 부터 n씩 자른다.
                my_str = my_str.substring(n);         // 자른 부분은 없앤다.
            } else {
                answer[i] = my_str.substring(0, my_str.length());  // 남은 부분이 n보다 수가 작다면, 남은만큼 까지만 배열에 저장한다.
            }
        }
        return answer;
    }
}

    // s 는 String
    // s.substring(s.indexOf("Java"), s.indexOf(".")));
    // 시작위치부터 끝 위치 "직전" 까지. 시작위치는 포함하지만, 끝 위치는 포함하지 않은 그 직전까지 잘라냄
    // System.out.println(s.substring(7));//인덱스 기준 7부터 시작 (이전 내용은 삭제)


    class Solution2 {
        public String[] solution(String my_str, int n) {
            List<String> answer = new ArrayList();

            for (int i = 0; i < (my_str.length() / n); i++) {

                answer.add(my_str.substring((n * i), (n * (i + 1))));
            }


            if (my_str.length() % n != 0) {

                answer.add(my_str.substring((my_str.length() / n) * n));
            }

            return answer.toArray(new String[0]);
        }
    }

    class Solution3 {
        public String[] solution(String my_str, int n) {
            int len = 0;
            if (my_str.length() % n == 0) {
                len = my_str.length() / n;
            } else {
                len = my_str.length() / n + 1;
            }
            String[] answer = new String[len];

            for (int i = 0; i < len; i++) {
                if (my_str.length() >= n) {
                    answer[i] = my_str.substring(0, n);
                    my_str = my_str.substring(n, my_str.length());
                } else {
                    answer[i] = my_str.substring(0, my_str.length());
                }

            }
            return answer;
        }
    }





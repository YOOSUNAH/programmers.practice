package Problem.num_1_100.num_81_90;

import java.util.ArrayList;
//문제 설명
//3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.
//제한사항
//1 ≤ n ≤ 100
//입출력 예
//n	result
//15	25
//40	76
public class num_85_numberOfCurses {
    public static void main(String[] args) {

    }


    class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 0; i < n; i++) {
                answer++;
                while(answer % 3 == 0 || String.valueOf(answer).contains("3")){
                    answer++; // 3의 배수거나 "3"을 포함하고 있으면 answer를 그 다음 숫자로 넘어감.
                }
            }
            return answer;

            // n = 5   answer = 0
            // i = 0   (+1) answer 1
            // i = 1   (+1) answer 2
            // i = 2   (+1) answer 3 -> while 문 타고 +1 answer = 4
            // i = 3   (+1) answer 5
            // i = 4   (+1) answer 6 -> while 문 타고 +1 answer = 7
            // i < n
            // n = 5   answer = 7
        }
    }

    class Solution2 {
        public int solution(int n) {
            int answer = 0;
            ArrayList<String> Num = new ArrayList<>();
            ArrayList<String> ThreeNum = new ArrayList<>();

            for (int i= 1; i <= 100; i++)
                Num.set(i - 1, String.valueOf(i));

            for (int i = 0; i <= 100; i++) {
                if (!Num.get(i).contains("3") || !(Integer.parseInt(Num.get(i)) % 3 == 0)){
                    ThreeNum.set(i, Num.get(i));
                }
                answer = Integer.parseInt(ThreeNum.get(i - n));
            }
            return answer;
        }
    }


}

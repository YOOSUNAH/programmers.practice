package Problem.num_1_100.num_81_90;
//문제 설명
//선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
//가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
//삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.
//제한사항
//sides의 원소는 자연수입니다.
//sides의 길이는 2입니다.
//1 ≤ sides의 원소 ≤ 1,000

//입출력 예
//sides	result
//[1, 2]	1
//[3, 6]	5
//[11, 7]	13

//입출력 예 #2
//가장 긴 변이 6인 경우
//될 수 있는 나머지 한 변은 4, 5, 6 로 3개입니다.
//나머지 한 변이 가장 긴 변인 경우
//될 수 있는 한 변은 7, 8 로 2개입니다.
//따라서 3 + 2 = 5를 return합니다.

import java.util.Arrays;

// 삼각형 결정 조건
// 세 변의 길이를 줬을 때 길이가 가장 긴 변의 길이는 다른 두 변 길이의 합보다 작아야 삼각형을 그릴 수 있어요
public class num_83_triangle {
    public static void main(String[] args) {

    }
    class Sol {
        public int solution(int[] sides) { // 채점 완료
            // int answer = 0;
            int bigValue = Math.max(sides[0], sides[1]);
            int smallValue = Math.min(sides[0], sides[1]);

            int lowLimit = bigValue - smallValue;   // x > 6 -3 , 6이 가장 긴변일 때
            int highLimit = bigValue + smallValue;  // x < 6 + 3 , x가 가장 긴변일 때

            return highLimit - lowLimit - 1;  // 6 - 3 < x < 6 +3  가운데에 있는 숫자들의 갯수

        }

    }
    class sol2{  // 채점 완료
        public int solution(int[] sides){
            int answer =0;
            Arrays.sort(sides);
            int min = sides[0];
            int max = sides[1];

            for (int i = max - min + 1; i <= max; i++){  // max가 가장 긴 변일 때, x 는 max -min 보다 크고, max 보다는 같거나 작아야 한다.
                answer++;
            }
            for (int i = max + 1; i < max + min; i++){  // 남은 x가 가장 긴 변일 때, x는 max + min보다 작아야하고, max 보다는 커야 한다.
                answer++;
            }

            return answer;
        }
    }
}

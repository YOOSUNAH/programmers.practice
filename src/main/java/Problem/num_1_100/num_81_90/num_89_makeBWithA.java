package Problem.num_1_100.num_81_90;
//문제 설명
//A로B만들기
//문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

//제한사항
//0 < before의 길이 == after의 길이 < 1,000
//before와 after는 모두 소문자로 이루어져 있습니다.

//입출력 예
//before	after	result
//"olleh"	"hello"	1
//"allpe"	"apple"	0

import java.util.Arrays;

public class num_89_makeBWithA {
    public static void main(String[] args) {

    }

    class Solution { // 처음했던 시도
        public int solution(String before, String after) {
            int answer = 0;

            String[] beforeArr = before.split("");
            String[] afterArr = after.split("");

            for (int i = 0; i < afterArr.length; i++) {
                for (int j = 0; j < beforeArr.length; j++) {
                    if (afterArr[i].equals(beforeArr[j])) {
                        beforeArr[i] = "";
                    }
                }

            }


            return answer;
        }
    }

    class Solution2 {
        public int solution(String before, String after) {
            int answer = 0;

            char[] beforeArr = before.toCharArray();
            char[] afterArr = after.toCharArray();

            Arrays.sort(beforeArr); // 정렬하고
            Arrays.sort(afterArr);

            String bes = new String(beforeArr);  // 다시 배열에서 문자열로 바꿔주고
            String afs = new String(afterArr);

            if (bes.equals(afs)) {  // 동일한지 비교하기
                answer = 1;
            } else {
                answer = 0;
            }
            return answer;
        }

    }
}


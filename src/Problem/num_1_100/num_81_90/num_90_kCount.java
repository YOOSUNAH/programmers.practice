package Problem.num_1_100.num_81_90;
// K의 개수
//문제 설명
//1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

//제한사항
//1 ≤ i < j ≤ 100,000
//0 ≤ k ≤ 9

//입출력 예
//i 	j	k	result
//1	   13	1	6
//10   50	5	5
//3	  10	2	0
public class num_90_kCount {
    public static void main(String[] args) {

    }

    class Solution1 { // 다른 풀이, 채점완료
        public int solution(int i, int j, int k) {
            int count = 0;
            String strK = String.valueOf(k);

            for (int l = i; l <= j; l++) {
                String value = String.valueOf(l);

                if (value.contains(strK)) {                   // k를 포함하는 지 확인
                    String[] array = value.split("");  // 포함하면 그걸 ""분리해서 넣음.
                    for (String alpha : array) {
                        if (alpha.equals(strK)) count++;   // 아예 똑같은 k가 있으면 count 해줌. (11 이런식으로 두개가 들어가 있을 수도 있으니깐)
                    }
                }
            }
            return count;
        }
    }

    class Solution2 { // 다른 풀이, 채점 완료
        public int solution(int i, int j, int k) {
            int answer = 0;

            for (int a = i; a <= j; a++) {  // 3부터 15까지라고 하면 i=3부터 시작해서 j = 15까지 범위를 잡고
                String strNum = Integer.toString(a); //  a를 1씩 더해주면서 String 으로 저장해야 한다. a = 3으로 for문 돌고. a=4로 for문 돌고, ...)
                for (int b = 0; b < strNum.length(); b++) {
                    if (Integer.toString(k).equals(strNum.substring(b, b + 1))) { // 2자리 수면 1 3 이라고 치면 (0부터 1 미만까지니깐 1 출력), (1부터 2미만까지니깐 3 출력)
                        answer++;
                    }
                }
            }
            return answer;
        }
    }

    class Solution0 { // 처음 시도
        public int solution(int i, int j, int k) {
            int answer = 0;
            int[] arr = new int[j];

            for (int q = 0; q < j ; q++) {
                arr[q] = i;
                i++;
            }

            for (int r = 0; r < arr.length; r++){
                if(String.valueOf(arr[i]).contains(String.valueOf(k))){
                    answer++;
                }
            }

            return answer;
        }
    }


}

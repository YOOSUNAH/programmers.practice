package Problem.num_1_100.num_91_100;

public class num_100_NextNumber {
    public void main(String[] args) {
        int[] key = {1, 2, 3, 4};

        num_100_NextNumber.Solution solution = new num_100_NextNumber.Solution();
        int[] result = new int[]{solution.solution(key)};
    }
    class Solution {
        public static int solution(int[] common) {
            int answer = 0;

            if((common[1] - common[0]) == (common[2] - common[1])) // 등차수열의 경우
            {
                answer = common[common.length-1] + (common[1] - common[0]);
            }
            else {// 등비수열의 경우
                answer = common[common.length - 1] * (common[1] / common[0]);
            }
            return answer;
        }
    }


}


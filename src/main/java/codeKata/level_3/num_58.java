package codeKata.level_3;

// 소수 만들기
public class num_58 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 7, 6, 4};
        solution(nums);
        solution(nums2);
    }

    public static int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    answer += isPrime(sum) ? 1 : 0;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static boolean isPrime(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) // 소수가 아닐 경우
                return false;
        }
        return true;
    }

}


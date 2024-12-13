package Problem.num_1_100.num_31_40;

public class num_36_eilllion_age {
    public static void main(String[] args) {

    }

    class Solution {
        public String solution(int age) {
            String answer = "";
            String age962 = "abcdefghij";
            String[] ageArr = String.valueOf(age).split("");

            for (int i = 0; i < ageArr.length; i++) {
                answer += age962.charAt(Integer.valueOf(ageArr[i]));
            }
            return answer;
        }
    }
}



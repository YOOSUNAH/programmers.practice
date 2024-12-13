package Problem.num_1_100.num_61_70;

public class num_65_similarity {
    public static void main(String[] args) {

    }
    class Solution {
        public int solution(String[] s1, String[] s2) {
            int answer = 0;
            for (int i =0; i < s1.length; i++){
                for (int j = 0; j < s2.length; j++){
                    if (s1[i].equals(s2[j])){
                        answer++;
                    }
                }
            }
            return answer;
        }
    }



}

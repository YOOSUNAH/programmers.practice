package codeKata.level_2;
// 수박수박수박수?
public class num_31 {
    class Solution {
        public String solution(int n) {
            String answer = "";
            String a = "수";
            String b = "박";

            if(n % 2 == 0) {
                for (int i = 0; i < n - i; i++) {
                    answer += a;
                    answer += b;
                }
            }else{
                answer = a;
                if(n == 1){
                    return answer;
                }
                else {
                    for (int i = 0; i < n - i - 1; i++) {
                        answer += b;
                        answer += a;
                    }
                }
            }
            return answer;
        }
    }
}

package codeKata.level_2;

// 가운데 글자 가져오기
public class num_30 {

    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] sArr = s.split("");
            if(sArr.length % 2 == 1){
                int index = sArr.length / 2;
                answer = sArr[index];
            }
            else{
                int index = sArr.length / 2;
                answer = sArr[index - 1];
                answer += sArr[index];
            }
            return answer;
        }
    }
}

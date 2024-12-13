package codeKata.level_2;

// x만큼 간격이 있는 n개의 숫자
//함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
// 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
public class num_16 {
    //    class Solution {
//        // 틀린 코드
////        public long[] solution(int x, int n) {
////            long[] answer = new long[n];
////            for (int i = 0; i < answer.length; i++) {
////                int num  = x * (i+1) ;
////                answer[i] = (long)num;
////            }
////            return answer;
//        }

    // 맞는 코드
    class Solution {

        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            long lnum = (long) x;
            for (int i = 0; i < answer.length; i++) {
                answer[i] = lnum;
                lnum += x;
            }
            return answer;
        }
    }
}



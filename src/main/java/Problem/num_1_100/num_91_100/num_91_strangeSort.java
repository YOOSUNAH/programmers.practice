package Problem.num_1_100.num_91_100;
//특이한 정렬
//문제 설명
//정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.

//제한사항
//1 ≤ n ≤ 10,000
//1 ≤ numlist의 원소 ≤ 10,000
//1 ≤ numlist의 길이 ≤ 100
//numlist는 중복된 원소를 갖지 않습니다.

//입출력 예
//numlist	                    n	result
//[1, 2, 3, 4, 5, 6]	        4	[4, 5, 3, 6, 2, 1]
//[10000,20,36,47,40,6,10,7000]	30	[36, 40, 20, 47, 10, 6, 7000, 10000]

import java.util.Arrays;
import java.util.Comparator;

public class num_91_strangeSort {
    public static void main(String[] args) {

    }

    class Solution { // 스트림 stream 을 활용
        public int[] solution(int[] numlist, int n) {

            return Arrays.stream(numlist)
                    .boxed() // boxing 처럼 원시타입을 클래스타입으로 전환해준다.
                    .sorted(Comparator.reverseOrder())  // 내림차순으로 정렬
                    // .sorted((o1, o2) -> Math.abs(o1 - n) - Math.abs(o2 - n))   내림차순으로 정렬
                    .mapToInt(Integer::intValue) // 스트림을 IntStream으로 변환
                    .toArray(); // 스트림을 배열로 변환하는 방법
        }
    }

//    class Solution2 {
//        public List solution(int[] numlist, int n) {
//            List<Integer> list = new ArrayList<>();
//            List<Integer> answer = new ArrayList<>();
//            for (Integer num : numlist) list.add(num);
//
//            int len = list.size();
//            for (int j = 0; j < len; j++) {
//                int minDif = 10000;
//                int minNum = 0;
//
//                for (int i = 0; i < list.size(); i++) {
//                    if (Math.abs(minDif) > Math.abs(list.get(i) - n)) {
//                        minNum = list.get(i);
//                        minDif = Math.abs(list.get(i) - n);
//                    } else if (Math.abs(minDif) == Math.abs(list.get(i) - n)) {
//                        System.out.println("list.get(i)");
//                        if (minNum < list.get(i)) minNum = list.get(i);
//                    }
//                }
//                answer.add(minNum);
//                list.remove(Integer.valueOf(minNum));
//            }
//            return answer;
//        }
//
//    }
}

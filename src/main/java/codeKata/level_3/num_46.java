package codeKata.level_3;
// 숫자 문자열과 영단어
// "one4seveneight"	 -> 1478

//숫자	영단어
//0	zero
//1	one
//2	two
//3	three
//4	four
//5	five
//6	six
//7	seven
//8	eight
//9	nine
public class num_46 {
    class Solution {
        public int solution(String s) {
            int answer = 0;
            String an = "";
            String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            for (int i = 0; i < arr.length; i++) {
                if (s.contains(arr[i])) {
                    s = s.replace(arr[i], String.valueOf(i));  //arr[i] 를 i(0, 1 , 2, 3, 4)로 변환
                }
            }
            answer = Integer.parseInt(s);
            return answer;
        }
    }
}

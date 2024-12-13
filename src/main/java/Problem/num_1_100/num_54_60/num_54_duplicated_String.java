package Problem.num_1_100.num_54_60;

import java.util.HashSet;
import java.util.Scanner;

public class num_54_duplicated_String {
    public static void main(String[] args) {

    }

    class Solution0 { // index of 사용
        public String solution(String my_string) {

            String answer = "";

            for(int i =0; i < my_string.length(); i++){
                if (my_string.indexOf(my_string.charAt(i)) == i){
                    answer += my_string.charAt(i);

                    // .charAt() : String 으로 저장된 문자열 중에서 한글자만 선택해서 char 타입으로 변환해주는 녀석
                    // .indexOf() : 특정 문자나, 문자열이 앞에서부터 처음 발견되는 인덱스를 반환


                }
            }
            return answer;
        }
    }

    class Solution { // index of 사용 _StringBuilder를 이용
        public String solution(String my_string) {
//            String answer = "";

            StringBuilder sb = new StringBuilder();
            for (char c : my_string.toCharArray()){
                if (sb.indexOf(String.valueOf(c)) == -1){
                    sb.append(c);
                }
            }
            return sb.toString();

        }
    }

    class Solution2 { // HashSet
        public String solution(String my_string) {

            if (my_string == null || my_string.isBlank()){
                return my_string;
            }
            StringBuilder sb = new StringBuilder();
            HashSet<Character> set = new HashSet<>();
            for (char c : my_string.toCharArray()){
                if (set.add(c)){
                    sb.append(c);
                }
            }

            return sb.toString();
        }
    }


    class Solution3 { // HashSet
        public String solution(String my_string) {

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            String answer = "";
            for (int i = 0; i < my_string.length(); i++){
                if (my_string.indexOf(my_string.charAt(i)) == i ){

                    // .charAt() : String 으로 저장된 문자열 중에서 한글자만 선택해서 char 타입으로 변환해주는 녀석
                    // .indexOf() : 특정 문자나, 문자열이 앞에서부터 처음 발견되는 인덱스를 반환

                    answer += str.charAt(i);
                }
            }

            return  answer;
        }
    }

}

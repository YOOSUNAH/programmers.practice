package Problem.num_1_100.num_91_100;
//이진수 더하기
//문제 설명
//이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.

//제한사항
//return 값은 이진수를 의미하는 문자열입니다.
//1 ≤ bin1, bin2의 길이 ≤ 10
//bin1과 bin2는 0과 1로만 이루어져 있습니다.
//bin1과 bin2는 "0"을 제외하고 0으로 시작하지 않습니다.

//입출력 예
//bin1	bin2	result
//"10"	"11"	"101"
//"1001"	"1111"	"11000"

//입출력 예 설명
//입출력 예 #1
//10 + 11 = 101 이므로 "101" 을 return합니다.
//입출력 예 #2
//1001 + 1111 = 11000 이므로 "11000"을 return합니다.
public class num_96_binaryNumber {
    public static void main(String[] args) {
        String a = "10";
        String b = "11";
        num_96_binaryNumber solution = new num_96_binaryNumber();
        Solution1 sol = solution.new Solution1();
        String result = sol.sol(a, b);
        System.out.println(result);
    }

    class Solution1 {
        public String sol(String bin1, String bin2) {

            return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
            // parseInt(String 문자열, int 진수) 을 넣어주면 진수인 문자열 값을 10진수 int타입으로 반환해준다.

            //(1)10진수를 2진수로 변환 할 때,
            //   Integer 클래스의 toBinaryString 함수를 사용하면 해당 숫자를 2진수로 변환할 수 있다.
            //(2)또한, 2진수를 10진수로 변환하기 위해서는,
            //   Integer 클래스의 parseInt를 사용하여 변환할 수 있다.
            //   ex. Integer.parseInt(String s, int n진수);
        }
    }
    class Solution2 {
        public String solution(String bin1, String bin2) {
            String answer = "";
            int num1 = Integer.parseInt(bin1, 2);
            int num2 = Integer.parseInt(bin2, 2);
            int res = num1+num2;
            answer = Integer.toBinaryString(res);
            return answer;
        }
    }


}

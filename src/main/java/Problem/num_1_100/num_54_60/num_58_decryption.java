package Problem.num_1_100.num_54_60;

public class num_58_decryption {
    public static void main(String[] args) {

    }
    class Solution2 {
        public String solution(String cipher, int code) {
            String answer = "";

            for (int i = code -1 ; i < cipher.length(); i += code){
                answer += cipher.charAt(i);
            }
            return answer;
        }
    }

    class Solution { // 안됨..
        public String solution(String cipher, int code) {
            String answer = "";
            String[] cipherArray = new String[cipher.length()];
            cipherArray = cipher.split("");

            for (int i = 1; i <= cipherArray.length; i++){
                answer += cipherArray[code * i];
            }

            return answer;
        }
    }

}

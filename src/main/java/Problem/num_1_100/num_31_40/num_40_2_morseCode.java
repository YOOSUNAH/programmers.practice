package Problem.num_1_100.num_31_40;

public class num_40_2_morseCode {
    public static void main(String[] args) {

    }

    public static String solution(String letter) {
        String answer = "";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...",
                "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        String[] morseSplit = letter.split(" ");


        for (String s : morseSplit) {
            for (int i = 0; i < morse.length; i++) {

                if(s.equals(morse[i]))
                    answer += Character.toString(i + 'a');
            }
        }
        // 자바에서 char를 int로 변환하면 아스키코드값이 나온다.
        // 'a' 문자가 char타입이 i 랑 더하면서 int 로 변환이 됨. 그럼 97이 됨.
        // Character.toString() 메서드에서 숫자를 전달하면 해당하는 아스키코드 문자가 리턴된다.

        return answer;

    }
}



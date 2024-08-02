package Problem.num_1_100.num_31_40;

import java.util.HashMap;
import java.util.Map;

public class num_40_morsecode {
    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        solution(letter);
  }

    public static String solution(String letter) {
        String answer = "";
        Map<String, String> morseMap = initMorseMap();

        for (String morse: morseMap.keySet() ) {

            String[] letterSplit = String.valueOf(letter).split(" ");

            for (int i = 0; i < Integer.parseInt(letter); i++){
                 answer += morseMap.get(letterSplit);
             }
            }
        return answer;
    }


    private static Map<String, String> initMorseMap() {
        Map<String, String> morseMap = new HashMap<>();
        morseMap.put(".-", "a");
        morseMap.put("-...", "b");
        morseMap.put("-.-.", "c");
        morseMap.put("-..", "d");
        morseMap.put(".", "e");
        morseMap.put("..-.", "f");
        morseMap.put("--.", "g");
        morseMap.put("....", "h");
        morseMap.put("..", "i");
        morseMap.put(".---", "j");
        morseMap.put("-.-", "k");
        morseMap.put(".-..", "l");
        morseMap.put("--", "m");
        morseMap.put("-.", "n");
        morseMap.put("---", "o");
        morseMap.put(".--.", "p");
        morseMap.put("--.-", "q");
        morseMap.put(".-.", "r");
        morseMap.put("...", "s");
        morseMap.put("-", "t");
        morseMap.put("..-", "u");
        morseMap.put("...-", "v");
        morseMap.put(".--", "w");
        morseMap.put("-..-", "x");
        morseMap.put("-.--", "y");
        morseMap.put("--..", "z");
        return morseMap;
    }


}

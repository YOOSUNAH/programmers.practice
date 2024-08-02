package Problem.num_1_100.num_61_70;


import java.util.ArrayList;
import java.util.List;

public class num_67_Calculate {
    public static void main(String[] args) {
    }

    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            String s = "";
            String[] arr = my_string.split("");
            List<String> inputs = new ArrayList<>();
            int index = 0;
            int numbersBeforeOperation = 0;
            int numbersAfterOperation = 0;

            for (int i = 0; i < arr.length; i++) {
                if (isNumber(arr[i])) {
                    inputs.add(arr[i]);
                }
                if (!isNumber(arr[i])) {
                    inputs.add(arr[i]);

                    index = findNotNumberIdx(arr);
                    numbersBeforeOperation = Integer.parseInt(arr[index - 1]);
                    numbersAfterOperation = Integer.parseInt(arr[index + 1]);
                }
                    if (arr[index].equals("+")) {
                        answer = plus(numbersBeforeOperation,numbersAfterOperation);
                    }
                    if (arr[index].equals("-")) {
                        answer = minus(numbersBeforeOperation,numbersAfterOperation);
                    }
                    inputs.add(String.valueOf(answer));
                }
            answer = Integer.parseInt(inputs.toString());
            return answer;
        }
    }


    private Integer minus(Integer numbersBeforeOperation, Integer numbersAfterOperation) {
        return numbersBeforeOperation - numbersAfterOperation;
    }

    private Integer plus(Integer numbersBeforeOperation, Integer numbersAfterOperation) {
        return numbersBeforeOperation + numbersAfterOperation;
    }

    private boolean isNumber(String my_string) {
        try {
            int number = Integer.parseInt(my_string);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    private Integer findNotNumberIdx(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!isNumber(arr[i])) {
                return i;
            }
        }
        return null;
    }


}

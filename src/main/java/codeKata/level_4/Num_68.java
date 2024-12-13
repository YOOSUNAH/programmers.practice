package codeKata.level_4;

import java.util.ArrayList;
import java.util.List;

// 햄버거 반들기
public class Num_68 {
    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        solution2(ingredient);
    }

    public static int solution2(int[] ingredient) {
        int[] intgredientArr = new int[ingredient.length];
        int index = 0;
        int answer = 0;

        for(int ing : ingredient) {
            intgredientArr[index] = ing;  // index 0, 1, 2, 3에 2, 1, 1, 2가 담긴다 .
            index++;

            if(index >= 4) {  // 최소 4개여야 함(1,2,3,1), index = 4 -> 5(index는 햄버거 못만들면 늘어난다)
                if
                (
                  intgredientArr[index-4] == 1      // 4-4 = 0  | 5-4 = 1
                    && intgredientArr[index-3] == 2 // 4-3 = 1  | 5-3 = 2
                    && intgredientArr[index-2] == 3 // 4-2 = 2  | 5-2 = 3
                    && intgredientArr[index-1] == 1 // 4-1 = 3  | 5-1 = 4
                )
                {
                    index -= 4; //햄버거 하나 만들었으면, index 를 다시 0으로
                    answer++; // 햄버거 하나 카운팅
                }
            }
        }
        System.out.println(answer);
        return answer;
    }


    public static int solution1(int[] ingredient) {
        int answer = 0;
        int[] hamburger = {1, 2, 3, 1};
        List<Integer> arr = new ArrayList<>();

        for (int i: ingredient) { // 배열을 list로 변환
            arr.add(i);

            while (arr.size() >= 4) { // 4개 이상이면 햄버거 만들 수 있음, 4개 미만이면 햄버거를 더이상 만들 수 없음.

                int n = arr.size(); // 처음엔 9

                if (!(arr.get(n - 4) == 1 // {1, 2, 3, 1}이 아니면 탈출
                    && arr.get(n - 3) == 2
                    && arr.get(n - 2) == 3
                    && arr.get(n - 1) == 1))
                    break;
                else {
                    for (int j = 0; j < 4; j++) {
                        arr.remove(arr.size() - 1);
                        System.out.println("remove" + (arr.size() - 1));
                    }
                }
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }

}

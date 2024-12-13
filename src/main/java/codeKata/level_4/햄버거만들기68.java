package codeKata.level_4;

public class 햄버거만들기68 {

    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        solution(ingredient);
    }

    public static int solution(int[] ingredient) {
        int answer = 0;
        int index = 0;

        int[] hamburger = new int[ingredient.length];

        for (int i : ingredient) {
            hamburger[index] = i;
            index++;

            if(index >= 4){
                if(hamburger[index - 4] == 1
                && hamburger[index -3] == 2
                && hamburger[index -2]  == 3
                && hamburger[index -1] ==1){
                    answer++;
                    index -= 4;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}

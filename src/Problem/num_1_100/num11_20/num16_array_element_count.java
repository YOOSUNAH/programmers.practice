package Problem.num_1_100.num11_20;

public class num16_array_element_count {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < answer.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}

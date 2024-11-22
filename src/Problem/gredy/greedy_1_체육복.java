package Problem.gredy;

public class greedy_1_체육복 {

    public static void main(String[] args) {
        int n = 5;
        int[] lostNum = {2, 4};
        int[] reserveNum = {1, 3, 5};
        System.out.println(greedySol(n, lostNum, reserveNum));
    }

    public static int greedySol(int n, int[] lostNum, int[] reserveNum){
        int[] student = new int[n]; // _, _, _, _, _
        int answer = n;  // 일단 다 있다고 가정

        for(int l : lostNum){  // 2, 4
            student[l - 1]--;  // _, -1 ,_ ,-1, _
        }

        for(int r : reserveNum){  // 1, 3, 5
            student[r - 1]++; // +1, _ , +1, _, +1
        }

        for (int i = 0; i < student.length; i++) {
            if(student[i] == -1 ){ // 체육복 도난시,
                if(i > 0 && student[i - 1] == 1 ){  // 왼쪽에 여벌이 있을 경우
                    student[i]++; // 빌림받고
                    student[i - 1]--; // 빌려주고
                }
                else if(i < n - 1 && student[i + 1] == 1){ // 오른쪽에 여벌이 있을 경우
                    student[i]++; // 빌림 받고
                    student[i + 1]--; // 빌려주고
                }else{
                    answer--;} // 둘다 못빌렸으면, 체육복이 없고.
            }
        }
        return answer; // 최종 체육복이 있는 answer
    }
}

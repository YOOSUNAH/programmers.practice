package Problem;

public class greedy_1_체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {3};
       
        System.out.println(solution_greedy(n, lost, reserve));
    }

    public static int solution_greedy(int n, int[] lost, int[] reserve) {
        int[] student = new int[n]; // _, _, _, _, _
        int answer = n; // 일단 다 있다고 가정 

        for(int l : lost){  // 2, 4 
            student[l - 1]--;   // _ -1, _, -1, _
        }
        
        for(int r: reserve){
            student[r - 1]++; // +1, -1, +1, -1, +1 
        }   
        
        for (int i = 0; i < student.length; i++) {
            // 도난 당한 학생의 경우 
            if(student[i] == -1){

                // 왼쪽 학생이 여벌 체육복을 가지고 있는 경우  
                if(i > 0 && student[i - 1] == 1){
                    student[i]++ ; // 빌림 받고      
                    student[i - 1]--; // 빌려주고 
                }
                    
                // 오른쪽 학생이 여벌 체육복을 가지고 있는 경우
                else if(i < n - 1  && student[i + 1] == 1){
                    student[i]++; // 빌림 받고 
                    student[i + 1]--; // 빌려주고 
                 
                }
                // 둘다 아닌 경우 -> 체육복을 못 빌려 
                else {
                    answer--;
                }    
            }      
        }
        return answer;
    }
}


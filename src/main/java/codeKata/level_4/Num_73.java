package codeKata.level_4;

// 공원 산책
public class Num_73 {

    public static void main(String[] args) {
        String[] park = {"SOO", "OOO", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};
        sol2(park, routes);
    }
        public static int[] sol2(String[] park, String[] routes){
            int sx = 0;
            int sy = 0;

            char[][] arr = new char[park.length][park[0].length()];

            // 시작위치 구하기
            for(int i = 0; i < park.length; i++){
                arr[i] = park[i].toCharArray();  //arr[0] -> "S", "0", "0"
                                                 // arr[0][0] = "S", arr[0][1] = "0", arr[0][2] = "0"으로 저장
                if(park[i].contains("S")){
                    sx = i;
                    sy = park[i].indexOf("S");
                }
            }
            // 이동방향, 거리 구하기
            for(String s : routes){
                String direction = s.split(" ")[0];   // "E"
                int length = Integer.parseInt(s.split(" ")[1]);  // "2"
                int nx = sx;
                int ny = sy;

                for(int i = 0; i < length; i++){
                    if(direction.equals("E")){
                        ny++;
                    }
                    if(direction.equals("W")){
                        ny--;
                    }
                    if(direction.equals("S")){
                        nx++;
                    }
                    if(direction.equals("N")){
                        nx--;
                    }
                    // 길이 제한 속에서
                    if(ny >=0 && nx >=0
                        && nx < arr.length   // 가로 길이 제한
                        && ny < arr[0].length){  // 세로 길이 제한
                        // 장애물 만나면 pass
                        if(arr[nx][ny] == 'X'){
                            break;
                        }
                        // 범위내 & 장애물 x, 거리만큼 이동 (i < length)
                        if(i == length - 1){
                            sx = nx;
                            sy = ny;
                        }
                    }
                }
            }

            int[] answer = {sx, sy};
//            System.out.println(answer[0] + " , " + answer[1]);
            return answer;
        }
}

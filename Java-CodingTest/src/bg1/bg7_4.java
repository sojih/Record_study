package bg1;

import java.util.Scanner;

// 09.26 2차원 배열 - 4. 색종이
// 좀 더 생각해보기
public class bg7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // boolean 타입의 2차원배열 100,100을 주어서
        // 겹치는 횟수 상관없이 true 값이 있는 넓이를 구하면 될듯
        int count = sc.nextInt();
        boolean[][] arr = new boolean[100][100];

        for(int i = 0; i < count; i++) {
            int width = sc.nextInt() - 1;
            int height = sc.nextInt() - 1;
            for(int j = width; j < width + 10; j++) {
                for(int k = height; k < height + 10; k++) {
                    arr[j][k] = true;
                }
            }
        }
        int area = 0;
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(arr[i][j]) {
                    area++;
                }
            }
        }
        System.out.println(area);

        // 가장 첫번째 받는 수 = 색종이 갯수 - 틀림 (여러번 겹칠때를 생각못함)
        // 뒤에오는 두 수를 통해 시작점을 저장하고
        // 색종이들의 시작점과 끝점을 파악해서 겹치는 넓이를 구함
//        int count = sc.nextInt();
//        int[][] arr = new int[count][2];
//        for(int i = 0; i < count; i++) {
//            arr[i][0] = sc.nextInt();
//            arr[i][1] = sc.nextInt();
//        }
//        // 겹치는 넓이 구하기
//        int area = 0;
//        for(int i = 0; i < count; i++) {
//            for(int j = 0; j < count; j++) {
//                // 가로 세로가 만나는지 확인 - 둘다 만나야 겹침
//                int a = Math.abs(arr[i][0] - arr[j][0]);
//                int b = Math.abs(arr[i][1] - arr[j][1]);
//                if(a != 0 && b != 0 && a < 10 && b < 10) {
//                    area += (10 - a) * (10 - b);
//                }
//            }
//        }
//        System.out.println(100 * count - area / 2);
    }
}

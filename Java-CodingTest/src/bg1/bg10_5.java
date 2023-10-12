package bg1;

import java.util.Scanner;

// 10.12 기하 - 대지
// 주어지는 구슬의 (x,y)좌표 N개를 받아 N개의 점을 둘러싸는 최소 크기의 직사각형의 넓이 출력
// 구슬 갯수 N은 1 ~ 100,000범위의 갯수, 좌표는 -10,000 ~ 10,000 범위의 정수
public class bg10_5 {
    public static void main(String[] args) {
        // 좌표를 받을 때마다 x,y의 최소, 최댓값을 받아
        // (x의 최댓값-최솟값) * (y의 최댓값 - 최솟값) 구하기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // x,y좌표 각각의 최솟값, 최댓값을 저장할 배열 정의
        int[] point = new int[4];

        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            // 초기화
            if(i == 0) {
                point[0] = x;
                point[1] = y;
                point[2] = x;
                point[3] = y;
            }
            // 최솟값, 최댓값 구하기 - 메모리, 시간 : 108576	964
//            if (x < point[0]) {
//                point[0] = x;
//            } else if (x > point[2]) {
//                point[2] = x;
//            }
//            if (y < point[1]) {
//                point[1] = y;
//            } else if (y > point[3]) {
//                point[3] = y;
//            }
            // 최솟값, 최댓값 구하기 - > Math.min(), Math.max()
            // 메모리, 시간 : 101104	904 (좀 더 빠름)
            point[0] = Math.min(point[0], x);
            point[1] = Math.min(point[1], y);
            point[2] = Math.max(point[2], x);
            point[3] = Math.max(point[3], y);
        }
        int area = (point[2] - point[0]) * (point[3] - point[1]);
        System.out.println(area);
    }
}

package bg1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

// 10.04 기하 - 2. 직사각형에서 탈출
// (x,y)에서 (0,0)~(w,h)인 직사각형의 경계선까지 가는 거리의 최솟값 구하기
public class bg10_2 {
    // 최솟값 구하려면
    // 1. x에서 0 또는 w까지의 거리
    // 2. y에서 0 또는 h까지의 거리
    // 중 짧은 거리 출력
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        int[] start = new int[4];
        int[] distance = new int[4];
        for(int i = 0; i < 4; i++) {
            start[i] = sc.nextInt();
        }
        distance[0] = start[0];
        distance[1] = start[2] - start[0];
        distance[2] = start[1];
        distance[3] = start[3] - start[1];

        Arrays.sort(distance);
        bw.write(Integer.toString(distance[0]));
        bw.flush();
        bw.close();
        sc.close();
    }
}

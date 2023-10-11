package bg1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// 2차원배열 - 1. 행렬 덧셈
// N*M 크기의 두 행렬 A,B가 주어졌을 때, 두 행렬을 더하는 프로그램
// 첫줄 : 행렬크기 N, M
// 둘쨋줄부터 : N개의 줄에 행렬 A의 원소 M개 주어짐,
//            N개의 줄에 행렬 B의 원소 M개가 차례대로 주어짐
// N,M <= 100, |행렬 원소| <= 100 정수
public class bg7_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        // 2차원 배열 A, B에 각 원소들 넣기
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // 넣은 원소들을 같은 행, 열의 것을 더해서 출력하기
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                bw.write(A[i][j] + B[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        sc.close();

    }
}


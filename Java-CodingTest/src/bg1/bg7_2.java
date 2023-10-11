package bg1;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// 09.26 2차원배열 - 2. 최댓값
// 0 ~ 90 범위에서 81개의 정수가 주어질 때(9행 9열)
// 이들 중 최댓값과 그 최댓값이 몇 행, 몇 열에 위치하는지 구하기
public class bg7_2 {
    public static void main(String[] args) throws IOException {
        // 1. 2차배열에 저장하고 반복문 돌리면서 최댓값과 행,렬 구하기
        // 2. Queue를 사용해 값이 들어올때마다 최댓값과 그 때의 순서를 기록 => 출력?
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        // 최댓값, 순서 저장할 변수 정의
        int max = 0;
        int count = 0;
        int temp = 0;

        for(int i = 0; i < 81; i++) {
            temp = sc.nextInt();
            if(temp > max) {
                max = temp;
                count = i;
            }
        }

//        System.out.println(max);
//        System.out.println((count / 9 + 1) + " " + (count % 9 + 1));
        bw.write(Integer.toString(max));    // !주의! BufferedWriter는 문자열만 출력하기 때문에 문자열로 변환해야함!(Z가 나왔음)
        bw.newLine();
        bw.write((count / 9 + 1) + " " + (count % 9 + 1));
        bw.flush();
        bw.close();
        sc.close();
    }
}

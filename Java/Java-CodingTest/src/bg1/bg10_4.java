package bg1;

import java.util.Scanner;

// 10.04 기하 - 4. 수학은 체육과목 입니다.
// 한 변의 길이가 1인 정사각형 가장 아랫부분의 정사각형이 n개가 되었을 때, 실선으로 이루어진 도형의 둘레의 길이 구하기
public class bg10_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
        // 조건에 1 ≤ n ≤ 10^9 라는 조건이 있음 -> 다음부터 확인 제대로하기
        long n = sc.nextLong();
        System.out.println(n * 4);
    }
}

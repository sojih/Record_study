package bg1;

import java.util.Scanner;

// 10.14 기하 - 삼각형 외우기
// 입력받는 세 각을 보고 삼각형의 종류를 출력한다
// 세 각이 60도 => Equilateral (60,60,60)
// 세 각 합 180, 두 각이 같으면 Isosceles (20,20,140), (35,110,35), (90,45,45)
// 세 각 합 180, 같은 각 없으면 Scalene (다 다른 각도)
// 세 각 합 180가 아니면 Error

// 1. 배열 사용
public class bg10_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        if (sum != 180) {
            System.out.println("Error");
        } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
            System.out.println("Equilateral");
        } else if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}

// 2. Queue 사용 => 코드상 효율은 없을 듯
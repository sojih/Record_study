package bg1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 10.16 기하 - 삼각형과 세 변
// 주어지는 세 변의 길이에 따라 결과 출력
// 세 변의 길이 같을 때 = Equilateral , 두 변의 길이 같을 때 = Isosceles , 길이가 모두 다를 때 = Scalene ,
// 가장 긴 변의 길이가 나머지 두 변의 길이 합보다 길 때 = Invalid
public class bg10_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 개행처리가 힘들어서 sout으로 시도
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String triangle = br.readLine();
            StringTokenizer st = new StringTokenizer(triangle);
            int[] arr = new int[3];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            if (arr[0] == 0) {
                break;
            } else if(arr[0] + arr[1] <= arr[2]) {
                System.out.println("Invalid");
            } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
                System.out.println("Equilateral");
            } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }

//        bw.flush();
//        bw.close();
        br.close();
    }
}

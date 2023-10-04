package bg1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 10.04 기하 - 네 번째 점
// 세 점이 주어지면 직사각형을 만들기 위한 네 번째 점을 출력
public class bg10_3 {
    // 점이 주어지면 일치하는 값이 있어야함(두 개 씩 같은 값 존재)
    // => (x,y)값 입력값이 있으면 없애기, 입력값이 없으면 최대 2개 저장하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> x = new LinkedList<Integer>();
        Queue<Integer> y = new LinkedList<Integer>();

        for(int i = 0; i < 6; i++) {
            int a = sc.nextInt();
            if(i % 2 == 0) {
                // x좌표
                if(x.isEmpty() || x.peek() != a) {
                    x.add(a);
                } else {
                    x.remove(a);
                }
            } else {
                // y좌표
                if(y.isEmpty() || y.peek() != a) {
                    y.add(a);
                } else {
                    y.remove(a);
                }
            }
        }
        System.out.println(x.peek() + " " + y.peek());
    }
}

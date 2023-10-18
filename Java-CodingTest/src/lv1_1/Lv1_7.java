package lv1_1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// x만큼 간격이 있는 n개의 숫자
// - 정수x와 자연수n을 입력받아 x부터 시작해 x씩 증가하는 숫자를 n개 가지는 리스트 리턴
public class Lv1_7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2,5)));
        System.out.println(solution1(2,5));
    }

    /** x로 시작해 x씩 증가하는 n길이의 배열,리스트를 return(x로 인해 long타입 배열 리턴) */
    public static long[] solution(int x, int n) {
        // 1. for문 사용 - n번 반복, x만큼 더하기
        // - 통과 (0.03ms, 72.9MB), 통과 (0.04ms, 74.9MB) - 이게 훨씬 빠름
        long[] answer = new long[n];

        for(int i = 0; i < n; i++) {
            // int * int = int로 인해 int값을 넘기는 오버플로우가 발생할 경우 다른 값이 들어가므로
            // long 타입으로 변환해줘야함!(그래서 case 13,14에서 틀림)
            answer[i] = (long)x * (i + 1);
        }
        return answer;
    }
    public static Queue<Long> solution1(int x, int n) {
        // 2. Queue 사용 - 통과 (0.22ms, 73.8MB),	통과 (0.28ms, 77.5MB)
        Queue<Long> q = new LinkedList<Long>();
        for(int i = 0; i < n; i++) {
            long item = (long)x * (i + 1);
            q.add(item);
        }

        return q;
    }
}

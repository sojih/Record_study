package lv1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// 10.02 - 나누어 떨어지는 숫자 배열
// aaray의 각 element 중 divisor로 나눠 떨어지는 값을 오름차순으로 정렬한 배열 반환
// 나누어 떨어지는 element가 하나도 없으면 배열에 -1 담아 반환
public class Lv1_17 {
    public static void main(String[] args) {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;
        System.out.println(solution(arr, divisor));
    }
//    public static int[] solution(int[] arr, int divisor) {
    public static Queue<Integer> solution(int[] arr, int divisor) {
        // 미리 정렬
//        Arrays.sort(arr);
        // 1. queue로 출력 - 통과 (0.70ms, 83.3MB), 통과 (3.01ms, 88.8MB)
        Queue<Integer> q = new LinkedList<Integer>();
        // 우선순위큐는 오름차순 정렬이 아니라 우선순위로만 정렬됨..(다름)
//        Queue<Integer> q = new PriorityQueue<Integer>();
        for(int e : arr) {
            if(e % divisor == 0) {
                q.add(e);
            }
        }
        if(q.isEmpty()) {
            q.add(-1);
        }
        return q;
        // 2. 배열로 출력 - 길이를 미리 알아야함

//        return answer;
    }
}

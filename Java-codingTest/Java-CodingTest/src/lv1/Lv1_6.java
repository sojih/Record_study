package lv1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 자연수 뒤집어 배열로 만들기 - 주어진 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열로 리턴
// 1번 방법이 가장 빨랐음 (String은 확실히 느렸음)
public class Lv1_6 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
        System.out.println(solution1(12345));
    }

    /** 각 자리 숫자를 순서를 뒤집은 배열로 return */
    public static int[] solution(long n) {
        // 1. 반복문을 사용해 각 자리 숫자를 구하고 갯수만큼 배열 정의, 값 넣기 - 	통과 (0.04ms, 79.4MB), 통과 (0.04ms, 75.6MB)
        // 자릿수를 먼저 구하고 배열을 생성한 후 넣어야함
        // java.lang.Math 클래스 사용하여 자릿수 구하기
        // 외, n만 String으로 바꿔서 길이를 구해 자릿수 구하기! - 통과 (0.07ms, 99.5MB), 통과 (0.03ms, 74.8MB)
//        int num = Long.toString(n).length();

        int num = (int)(Math.log10(n) + 1);
        int[] answer = new int[num];

        for(int i = 0; i < num; i++) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        return answer;

        // 2. 문자열로 변환, 문자단위로 끊고 숫자로 변환하여 배열에 넣기 - 통과 (0.44ms, 72.4MB)
//        String str = Long.toString(n);
//        String[] strArr = str.split("");
//        System.out.println(Arrays.toString(strArr));
//
//        int[] answer = new int[strArr.length];
//        for(int i = strArr.length - 1; i >= 0; i--) {
//            answer[strArr.length - 1 - i] = Integer.parseInt(strArr[i]);
//        }
//        return answer;

        // 여기서 reverse() 메서드 사용하면 반복문 어렵지 않음!
    }

    public static Queue<Integer> solution1(long n) {
//        int[] answer = {};
        // 3. 반복문을 사용해 각 자리 숫자를 구하고 갯수만큼 배열 정의, 값 넣기 - 통과 (0.12ms, 76.7MB)
        // 자릿수를 먼저 구하고 배열을 생성한 후 넣어야함

        // 1. Queue 사용
        Queue<Integer> q = new LinkedList<Integer>();
        while (n > 10) {
            q.add((int) (n % 10));
            n /= 10;
        }
        q.add((int) n);
        return q;
    }

    /*
    import java.util.LinkedList;
    import java.util.Queue;

    class Solution {
        public Queue<Integer> solution(long n) {
            Queue<Integer> q = new LinkedList<Integer>();
            while (n > 10) {
                q.add((int) (n % 10));
                n /= 10;
            }
            q.add((int) n);
            return q;
        }
    }
     */

}

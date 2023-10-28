package Algorithm;

import java.util.Arrays;

// 10.28 배열 - H-index
// H-Index값 리턴
// 주어지는 배열 citations의 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지가 h번 이하 인용되었다면
// h의 최댓값이 H-Index이다
public class P_array_3 {
    public static void main(String[] args) {
        int[] cirations = {3, 0, 6, 1, 5};
        // {0, 0, 0}일때 리턴값도 나오는지 생각해보기
        P_array_3 p = new P_array_3();
        System.out.println(p.solution(cirations));
        System.out.println(p.solution1(cirations));
    }

    // 1. 0부터 시작하는 반복문을 돌려서 h값보다 큰 값이 h개 이상, h개 이하 이면 h값
    // h = 2이면 3,6,5로 3편의 논문이 2번 이상 인용되었고, 0, 1로 2편이 2번 이하 인용됨 => 가능
    // h = 3이면 마찬가지로 가능 => 최댓값
    // h는 h번이상 인용된 h개보다 같거나 작고, h번 이하 인용된 h개보다 같거나 크다 => h는 n보다 같거나 작다
    // 그 중 h의 최댓값 리턴하기
    public int solution(int[] citations) {
        int answer = 0;

        int h = citations.length;
        while(h > 0) {
            int over = 0;
            int below = 0;
            // 파라미터로 받은 배열의 요소 하나하나 비교
            for(int e : citations) {
                if(e == h) {
                    over++;
                    below++;
                } else if (e > h) {
                    over++;
                } else {
                    below++;
                }
            }
            if(h <= over && h >= below) {
                return h;
            }
            h--;
        }
        return answer;
    }

    // 배열 정렬 후 중간 값 리턴하면?
    // => 오름차순까지 정렬했으나 다음 과정이 같아서 넘김
    
    // 프로그래머스 다른 사람 풀이
    public int solution1(int[] citations) {
        int answer = 0;

        // 오름차순 정렬
        Arrays.sort(citations);
        // 길이 구하기
//        int n = citations.length;
//        int h = n / 2;
        // 반복문을 돌면서 h보다 작은 수가 h개보다 많을 경우 h-- 하면서 h값 구하기
        int below = 0;
//        for(int i = 0; i < n; i++) {
//            if(citations[i] <= h) { // h보다 작거나 같을 때
//                below++;
//            } else {
//
//            }
//        }
        for(int i=0; i<citations.length; i++){
            int smaller = Math.min(citations[i], citations.length-i);
            answer = Math.max(answer, smaller);
        }

        return answer;
    }
}

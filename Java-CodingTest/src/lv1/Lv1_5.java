package lv1;

// 나머지가 1이 되는 수 찾기 - 주어진 자연수 n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 리턴
public class Lv1_5 {

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
    /** 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 return */
    public static int solution(int n) {

        // 1. 자연수 1부터 반복(< n)해서 나머지가 1인 수를 바로 리턴 - 통과 (6.63ms, 83.7MB)
        int i = 1;
        while(n % i != 1) {
            i++;
        }
        return i;

        // 2. for문, if문 사용 - 통과 (7.13ms, 71.9MB)
//        int answer = 0;
//        for(int i = 1; i < n; i++) {
//            if(n % i == 1) {
//                answer = i;
//                break;
//            }
//        }
//        return answer;
    }
}

package lv1_1;

// 09.25 하샤드 수
// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 한다
// ex. 18 -> 1+8=9, 18은 9로 나누어 떨어지므로 18은 하샤드 수
public class Lv1_12 {
    public static void main(String[] args) {
        System.out.println(solution(13));
    }

    /** 하샤드의 수인지 판별 */
    // 통과 (0.03ms, 75.7MB),	통과 (0.04ms, 73.3MB)
    public static boolean solution(int x) {
        boolean answer = false;
        int num = (int)Math.log10(x) + 1;
        int[] arr = new int[num];
        int temp = x;
        for(int i = 0; i < num; i++) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        int sum = 0;
        for(int item : arr) {
            sum += item;
        }

        if(x % sum == 0) {
            return true;
        }
        return answer;
    }
}

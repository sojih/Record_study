package lv1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 문자열 내 p와 y의 개수
// - 대소문자가 섞여있는 문자열 s에 'p'와 'y' 갯수를 비교해 같으면 True, 다르면 False를 리턴
public class Lv1_9 {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
    }

    /** 'p'와 'y'의 갯수가 같으면 true 아니면 false 리턴(대소문자 구별x, p,y가 없으면 항상 true) */
    static boolean solution(String s) {
//        boolean answer = true;

        // 1. 문자 배열로 변환 - 통과 (0.02ms, 73.1MB), 통과 (0.04ms, 65.5MB)
        char[] arr = s.toCharArray();
        int pCount = 0;
        int yCount = 0;
        
        // p, y 갯수 세기
        for(char item : arr) {
            if(item == 'p' || item == 'P') {
                pCount++;
            } else if (item == 'y' || item == 'Y') {
                yCount++;
            }
        }
        // 갯수 비교하기
        if(pCount == yCount) {
            return true;
        }
        return false;

        // 2. 대소문자 구별없이

//        return answer;
    }

}

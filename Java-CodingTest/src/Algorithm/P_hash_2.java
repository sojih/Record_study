package Algorithm;

import java.util.HashSet;

// 10.28 해시 - 2. 완주하지 못한 선수
// 마라톤에 참여한 선수들의 이름 배열과 완주한 선수들의 이름 배열이 주어질 때,
// 완주하지 못한 선수 이름 리턴하기
public class P_hash_2 {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        P_hash_2 p = new P_hash_2();
        System.out.println(p.solution(participant, completion));
        System.out.println(p.solution1(participant, completion));
    }

    // 이전 틀렸던 풀이
    public String solution(String[] participant, String[] completion) {
        String result = "";
        HashSet<String> hs = new HashSet<>();

        // 완주자를 HashSet에 넣음
        for(String finisher : completion) {
            hs.add(finisher);
        }

        // 완주자 목록에서 목록이 빌때까지 참가자를 빼면서 제거되지 않는 사람을 리턴
        for(String people : participant) {
            if(hs.isEmpty() || !hs.remove(people)) {
                result = people;
            }
        }
        return result;
    }

    // 풀기
    // - 동명이인 생각하기 => 중복도 가능해야하므로 Set을 사용하면 안될 것 같다 (Set : 저장 순서 유지 X, 데이터 중복 X)
    // - 값을 찾기(Read)에 빠른 자료구조로 바꾸기
    public String solution1(String[] participant, String[] completion) {
        String result = "";

        return result;
    }
}

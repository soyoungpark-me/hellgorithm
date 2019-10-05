package leetcode;

import java.util.*;

public class SubSets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // 일단 빈 배열 하나 추가
        result.add(new ArrayList<>());

        for (int current : nums) {
            // 임시로 set 만든다음에 순회 끝나고 합치기
            // for문 안에서 돌리면 ConcurrentModificationException 발생
            Set<List<Integer>> tmpSet = new HashSet<>();

            // result에 들어간 애들마다 현재 숫자를 더한 리스트 추가로 만들어서 결과에 더해줌
            // Stream.forEach를 for문으로 고치니까 짱빨라짐... (35ms > 1ms)
            for (List<Integer> list : result) {
                List<Integer> tmpList = new ArrayList<>(list);
                tmpList.add(current);
                tmpSet.add(tmpList);
            }
            result.addAll(tmpSet);
        }
        return result;
    }
}

package leetcode;

import java.util.*;

public class SubSets {
    public static List<List<Integer>> subsets(int[] nums) {
        // TODO 너무 느린듯 심각함
        List<List<Integer>> result = new ArrayList<>();

        // 일단 빈 배열 하나 추가
        result.add(new ArrayList<>());

        for (final int current : nums) {
            // 임시로 set 만든다음에 순회 끝나고 합치기
            Set<List<Integer>> tmpSet = new HashSet<>();

            // result에 들어간 애들마다 현재 숫자를 더한 리스트 추가로 만들기
            result.forEach(list -> {
                List<Integer> tmpList = new ArrayList<>(list);
                tmpList.add(current);
                tmpSet.add(tmpList);
            });
            result.addAll(tmpSet);
        }
        return result;
    }
}

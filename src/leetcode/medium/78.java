import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // 일단 빈 배열부터 하나 추가
        result.add(Collections.emptyList());

        for (int current : nums) {
            // 임시로 set 만든 다음에 순회 끝나고 합치기
            // for문 내에서 result에 바로 추가하면 ConcurrentModificationException 발생
            Set<List<Integer>> tmpSet = new HashSet<>();

            // result에 들어간 친구들별로 현재 숫자(current)를 더한 리스트를 추가로 만들어서 결과에 더해줌
            // Stream.forEach를 for문으로 고치니까 짱빨라짐...
            for (List<Integer> list : result) {
                List<Integer> tmpList = new ArrayList<>(list);
                tmpList.add(current);
                tmpSet.add(tmpList);
            }
            // Q. 이렇게 별도로 만들어서 끝나고 합쳐주는 방법밖에 없는지 ...
            result.addAll(tmpSet);
        }
        return result;
    }
}

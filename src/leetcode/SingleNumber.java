package leetcode;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        // 먼저 주어진 값 정렬하고
        Arrays.sort(nums);

        // 첫 번째 친구 체크
        if (nums.length == 1 || nums[0] != nums[1]) {
            return nums[0];
        }

        // 앞 뒤 값 비교해서 같지 않으면 return
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] != nums[i] && nums[i] != nums[i+1]) {
                return nums[i];
            }
        }

        // 이래도 없으면 마지막 친구
        return nums[nums.length - 1];
    }
}

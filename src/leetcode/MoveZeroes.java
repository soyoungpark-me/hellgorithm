package leetcode;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        // TODO Runtime 너무 느림!
        for (int i = 1; i< nums.length; i++) {
            if (nums[i] == 0) continue;
            int j = i;
            while (nums[j - 1] == 0) {
                nums[j - 1] = nums[j];
                nums[j] = 0;
                if (--j < 1) break;
            }
        }
    }
}

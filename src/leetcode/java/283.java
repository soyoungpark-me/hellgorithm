//class Solution {
//    public static void moveZeroes(int[] nums) {
//        int zeroCount = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                zeroCount++;
//            } else {
//                nums[i - zeroCount] = nums[i];
//            }
//        }
//
//        for (int i = 1; i < zeroCount + 1; i++) {
//            nums[nums.length - i] = 0;
//        }
//    }
//}

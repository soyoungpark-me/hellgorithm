//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int count = 1;
//        for (int i = 1; i < nums.length; i++) {
//            // 여기서 i를 쓰면 중간에 nums를 조작하기 때문에 나중에 꼬인다...
//            if (nums[count - 1] != nums[i] && nums[count - 1] < nums[i]) {
//                // 1. 해당 숫자의 값을 땡겨오고
//                nums[count] = nums[i];
//                // 2. 숫자 개수를 늘린다.
//                count++;
//            }
//        }
//        return count;
//    }
//}

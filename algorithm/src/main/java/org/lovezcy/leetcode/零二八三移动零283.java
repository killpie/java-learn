package org.lovezcy.leetcode;

/**
 * @Auther: killpie
 * @Date: 2023/7/22 14:35
 * @Description: 283 题「移动零
 */
class 零二八三移动零283 {
    void moveZeroes(int[] nums){
        int slow = 0;
        int fast = 0;

        while (fast<nums.length){
            if (nums[fast] != 0){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }

    }

}

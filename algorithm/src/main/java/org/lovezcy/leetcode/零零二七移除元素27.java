package org.lovezcy.leetcode;

/**
 * @Auther: killpie
 * @Date: 2023/7/22 14:23
 * @Description: 27 题「移除元素
 */
public class 零零二七移除元素27 {


    int removeElement(int[] nums, int val){
        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            if (nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;
    }

}

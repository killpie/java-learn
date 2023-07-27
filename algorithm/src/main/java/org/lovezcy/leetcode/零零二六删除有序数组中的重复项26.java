package org.lovezcy.leetcode;

/**
 * @Auther: killpie
 * @Date: 2023/7/16 17:37
 * @Description: 第 26 题「删除有序数组中的重复项
 */
class 零零二六删除有序数组中的重复项26 {

    int removeDuplicates(int[] nums){
        if (nums == null || nums.length == 0){
            return 0;
        }
        int length = 1;//初始长度
        int realIndex = 1;//真实索引

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1]<nums[i]){
                length++;
                nums[realIndex] = nums[i];
                realIndex++;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(new 零零二六删除有序数组中的重复项26().removeDuplicates(nums));
    }



}

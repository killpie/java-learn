package org.lovezcy;

/**
 * @Auther: killpie
 * @Date: 2023/7/11 23:21
 * @Description:
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> trance = new LinkedList<>();

    public static void main(String[] args) {
        List<List<Integer>> r= new Solution().permute(new int[]{1, 2, 3});
        System.out.println(r);
    }

    public List<List<Integer>> permute(int[] nums) {
        f(nums);
        return res;
    }

    public void f(int [] nums){
        if (trance.size() == nums.length){
            res.add(new LinkedList<>(trance));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (trance.contains(nums[i])){
                continue;
            }
            trance.add(nums[i]);
            f(nums);
            trance.removeLast();
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)


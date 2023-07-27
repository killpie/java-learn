package org.lovezcy.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Auther: killpie
 * @Date: 2023/7/26 23:02
 * @Description: 322 题「零钱兑换」：
 */
public class 零三二二零钱兑换322 {

    public static void main(String[] args) {
        int[] coins = {1,3,5};
        System.out.println(new 零三二二零钱兑换322().coinChange(coins,6));
    }
    // coins 中是可选硬币面值，amount 是目标金额
    int coinChange(int[] coins, int amount){
      //dp方程 dp[i] = min(dp[amount-coins[i]]+1,dp[i])
        //dp[i] 凑够i的总数需要最少的硬币种类

        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        //当金额为0时,需要0种硬币, 也就是当为0时就收敛了
        dp[0] = 0;
        for (int i = 1; i < amount+1; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i-coins[j]<0){
                    continue;
                    //尝试下一个币值
                }
                dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                //dp[i]:凑够i的总数需要最少的硬币种类
                //dp[i-coins[j]]+1: 当i减去当前币值后剩余金额的最少的硬币种类+需要的当前币种的数量也就是1
                //两者对比后,取最小
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];

    }
}

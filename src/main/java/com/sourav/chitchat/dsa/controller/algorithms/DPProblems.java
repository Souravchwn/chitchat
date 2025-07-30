package com.sourav.chitchat.dsa.controller.algorithms;

import org.springframework.stereotype.Component;

/**
 * Created by souravkumarchowhan on 30/07/2025
 *
 * @author : souravkumarchowhan
 * @Date : 30/07/2025
 * @File : {@link DPProblems}
 */
@Component
public class DPProblems {
    public Object fibonacci(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}

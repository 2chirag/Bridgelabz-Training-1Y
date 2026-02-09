package com.GLA.arrays;
import java.util.*;

public class LC1920 {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int idx = nums[i];
            int value = nums[idx];
            ans[i] = value;
        }
        return ans;
    }
}

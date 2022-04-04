import java.util.Arrays;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for (int num : nums)
            if (!map.add(num))
                map.remove(num);
        return map.isEmpty() ? -1 : map.iterator().next();
    }
}
// @lc code=end

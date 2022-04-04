/*
 * @lc app=leetcode.cn id=137 lang=java
 *
 * [137] 只出现一次的数字 II
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

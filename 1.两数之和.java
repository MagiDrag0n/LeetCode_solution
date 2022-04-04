/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // nums[j] = target - nums[i]
            int diff = target - nums[i];
            // 如果存在diff，则返回diff和nums[i]的下标
            // HashMap的containsKey方法判断该HashMap中是否存在这个key
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            } else // 否则，将nums[i]存入map中，进行下一次循环
                map.put(nums[i], i);
        }
        return new int[0];
    }
}
// @lc code=end

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }
}
// class Solution {
// public List<List<Integer>> generate(int numRows) {

// List<List<Integer>> listResult = new ArrayList<>();
// List<Integer> list1 = new ArrayList<>();
// List<Integer> list2 = new ArrayList<>();
// list1.add(1);
// list2.add(1);
// list2.add(1);

// if (numRows == 1) {//numRows=1时
// listResult.add(list1);
// return listResult;
// }
// listResult.add(list1);

// if (numRows == 2) {//numRows=2时
// listResult.add(list2);
// return listResult;
// }
// listResult.add(list2);
// List<Integer> oldlist = list2;

// for (int i = 3; i <= numRows; i++) {//numRows大于等于3的情况
// List<Integer> newlist = new ArrayList<>();
// newlist.add(1);//第一位都为1
// for (int j = 1; j < i; j++) {
// if (j < i - 1) {
// newlist.add(oldlist.get(j - 1) + oldlist.get(j));
// } else {
// newlist.add(1);//最后一位为1
// }
// }
// listResult.add(newlist);
// oldlist = newlist;

// }
// return listResult;

// }
// }
// @lc code=end

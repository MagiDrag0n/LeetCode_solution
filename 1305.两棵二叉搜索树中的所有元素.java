/*
 * @lc app=leetcode.cn id=1305 lang=java
 *
 * [1305] 两棵二叉搜索树中的所有元素
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> nums1 = new ArrayList<Integer>();
        List<Integer> nums2 = new ArrayList<Integer>();
        inorder(root1, nums1);
        inorder(root2, nums2);

        List<Integer> merged = new ArrayList<Integer>();
        int p1 = 0, p2 = 0;
        while (true) {
            if (p1 == nums1.size()) {
                merged.addAll(nums2.subList(p2, nums2.size()));
                break;
            }
            if (p2 == nums2.size()) {
                merged.addAll(nums1.subList(p1, nums1.size()));
                break;
            }
            if (nums1.get(p1) < nums2.get(p2)) {
                merged.add(nums1.get(p1++));
            } else {
                merged.add(nums2.get(p2++));
            }
        }
        return merged;
    }

    public void inorder(TreeNode node, List<Integer> res) {
        if (node != null) {
            inorder(node.left, res);
            res.add(node.val);
            inorder(node.right, res);
        }
    }
}
// @lc code=end

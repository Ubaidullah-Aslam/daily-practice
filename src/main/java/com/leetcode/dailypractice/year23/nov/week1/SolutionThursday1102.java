package com.leetcode.dailypractice.year23.nov.week1;

/**
 * https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/ Count
 * Nodes Equal to Average of Subtree Medium 1.7K 27 Companies Given the root of
 * a binary tree, return the number of nodes where the value of the node is
 * equal to the average of the values in its subtree.
 * 
 * Note:
 * 
 * The average of n elements is the sum of the n elements divided by n and
 * rounded down to the nearest integer. A subtree of root is a tree consisting
 * of root and all of its descendants.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [4,8,5,0,1,null,6] Output: 5 Explanation: For the node with
 * value 4: The average of its subtree is (4 + 8 + 5 + 0 + 1 + 6) / 6 = 24 / 6 =
 * 4. For the node with value 5: The average of its subtree is (5 + 6) / 2 = 11
 * / 2 = 5. For the node with value 0: The average of its subtree is 0 / 1 = 0.
 * For the node with value 1: The average of its subtree is 1 / 1 = 1. For the
 * node with value 6: The average of its subtree is 6 / 1 = 6. Example 2:
 * 
 * 
 * Input: root = [1] Output: 1 Explanation: For the node with value 1: The
 * average of its subtree is 1 / 1 = 1.
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the tree is in the range [1, 1000]. 0 <= Node.val <=
 * 1000
 */



public class SolutionThursday1102 {
	// Definition for a binary tree node.
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	public int averageOfSubtreeMine(TreeNode root) {
		return 0;
	}
	public static void main(String[] args) {
	//[4,8,5,0,1,null,6]
	//Output: 5
	System.out.println(new SolutionThursday1102().averageOfSubtreeMine(null));
	System.out.println("");
	//[1]
	//Output: 1
	System.out.println(new SolutionThursday1102().averageOfSubtreeMine(null));
	}
    public int averageOfSubtree(TreeNode root) {
        int[] result = new int[1];
        traverse(root, result);
        return result[0];
    }

    private int[] traverse(TreeNode node, int[] result) {
        if (node == null) return new int[]{0, 0};
        
        int[] left = traverse(node.left, result);
        int[] right = traverse(node.right, result);
        
        int currSum = node.val + left[0] + right[0];
        int currCount = 1 + left[1] + right[1];
        
        if (currSum / currCount == node.val) result[0]++;
        
        return new int[]{currSum, currCount};
    }
	
}

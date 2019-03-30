package leetCode;

import java.util.ArrayList;
import java.util.Collections;

import sun.reflect.generics.tree.Tree;

/**
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * @author dell
 *
 */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class ExTree1_1 {
	public static void main(String[] args) {
		TreeNode node=new TreeNode(1);
		TreeNode node1=new TreeNode(2);
		node.left=node1;
		run(node);
	}
	/**
	 * 重点：深度是到叶结点，注意叶结点的判断，左右子树均为空
	 * @param root
	 * @return
	 */
	 public static int run(TreeNode root) {
	 if(root==null)return 0;
		 ArrayList<Integer> list=new ArrayList<Integer>();//存储深度
	 Depth(root, list, 0);
	 Collections.sort(list);

		 return list.get(0);
	    }
	 public static void Depth(TreeNode root,ArrayList<Integer> list,int depth){
		 if(root==null)return;
		 if(root.left==null&&root.right==null){
			 list.add(depth+1);
			 depth=0;
			 return;
		 }
		 
		 Depth(root.left, list, depth+1);
		 Depth(root.right, list, depth+1);
	 }
}

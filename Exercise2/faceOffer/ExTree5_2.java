/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * AVL tree：它是一 棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树
 * @author dell
 *
 */
public class ExTree5_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		TreeNode node4=new TreeNode(4);
		TreeNode node5=new TreeNode(5);
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		System.out.println(IsBalanced_Solution(node1));
	}
	static ArrayList<Integer> deplist=new ArrayList<Integer>();
	static int left=0,right=0;
	/**
	 * 
	 * @param root
	 * @return
	 */
	public static boolean IsBalanced_Solution(TreeNode root) {
		if(root==null)return true;
		ReDep(root, 0);
		Collections.sort(deplist);
		System.out.println(deplist);
		if(deplist.get(deplist.size()-1)-deplist.get(0)<=1){
			return true;
		}
		return false; 
    }
	public static void ReDep(TreeNode root,int deep){
		if(root==null){
			deplist.add(deep);
		
		}
			else {
				if(root.left==null){
					ReDep(root.right, deep+1);
				}
				if(root.right==null){
					ReDep(root.left, deep+1);
				}
				ReDep(root.left,deep+1);
				ReDep(root.right, deep+1);
		
			}
	}
}
/*
public class Solution {
public boolean IsBalanced_Solution(TreeNode root) {
     if (root == null)
         return true;

     if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1)
         return false;

      
     return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);

 }

 public int getHeight(TreeNode root) {
     if (root == null)
         return 0;
     return max(getHeight(root.left), getHeight(root.right)) + 1;
 }

 private int max(int a, int b) {
     return (a > b) ? a : b;
 }
}*/
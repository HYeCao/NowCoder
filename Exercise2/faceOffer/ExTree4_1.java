/**
 * 
 */
package faceOffer;

import java.util.LinkedList;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * 思想：1.直接使用中序遍历进行实现
 *      2.来回绕
 * @author dell
 *
 */

public class ExTree4_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static TreeNode head;
	static TreeNode prehead;
	 public static  TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree==null)return null;
		MidTran(pRootOfTree);
			return prehead;
	    } 
	public static void MidTran(TreeNode root){
		if(root==null)return ;
		MidTran(root.left);
		if(head==null){
			head=root;
			prehead=root;
		}
		
		else{
		head.right=root;
		root.left=head;
		head=root;
		}
		MidTran(root.right);
		return ;
	}
}

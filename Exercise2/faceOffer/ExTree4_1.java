/**
 * 
 */
package faceOffer;

import java.util.LinkedList;

/**
 * ����һ�ö��������������ö���������ת����һ�������˫������
 * Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 * ˼�룺1.ֱ��ʹ�������������ʵ��
 *      2.������
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

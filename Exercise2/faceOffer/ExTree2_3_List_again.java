/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/*****************************
 * @author dell***************
 * 重点题 *********************
 * ***************************
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印
 * 队列deque先进先出
 */
public class ExTree2_3_List_again {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node4.left = node8;
		node4.right = node9;
		PrintFromTopToBottom(node1);
	}

	private static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)return null;
		ArrayList<Integer> list=new ArrayList<>();
		Deque<TreeNode> deque=new LinkedList<TreeNode>();//队列先进先出
		TreeNode temp;
		deque.add(root);
		while(!deque.isEmpty()){
			temp=deque.pop();
			list.add(temp.val);
			if(temp.left!=null)deque.add(temp.left);
			if(temp.right!=null)deque.add(temp.right);
		}
		return list;
	}

}

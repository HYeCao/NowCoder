/**
 * 
 */
package leetCode;

import java.util.ArrayList;


/**
 * 给定二叉树，返回其节点值的后序遍历。
 * 例如：
 * 给定二叉树{1，＃，2,3}
 * return[3,2,1]
 * @author dell
 *
 */
public class ExTree2_1_PostOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ArrayList<Integer> postorderTraversal(TreeNode root) {
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 EndBianli(root, list);
		 return list;
	  }
	 public void EndBianli(TreeNode root,ArrayList<Integer> list){
		 if(root==null){
			 return;
		 }
		 else{
			 EndBianli(root.left, list);
			 EndBianli(root.right, list);
			 list.add(root.val);
		 }
	 }
}

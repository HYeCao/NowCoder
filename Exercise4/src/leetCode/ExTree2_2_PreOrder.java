/**
 * 
 */
package leetCode;

import java.util.ArrayList;

/**
 * Given a binary tree, return the preorder traversal of its nodes' values. 
 * For example:
 * Given binary tree{1,#,2,3}, 
 * @author dell
 *
 */
public class ExTree2_2_PreOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public ArrayList<Integer> preorderTraversal(TreeNode root) {
	       ArrayList<Integer> list=new ArrayList<Integer>();
			 EndBianli(root, list);
			 return list;
		  }
		 public void EndBianli(TreeNode root,ArrayList<Integer> list){
			 if(root==null){
				 return;
			 }
			 else{
	             list.add(root.val);
				 EndBianli(root.left, list);
				 EndBianli(root.right, list);
				
			 }
		 }
}

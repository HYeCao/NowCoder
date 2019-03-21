/**
 * 
 */
package faceOffer;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 * @author dell
 *
 */
public class ExTree2_2_again {

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
		Mirror(node1);
	}

	private static void Mirror(TreeNode root) {
		// TODO Auto-generated method stub
		TreeNode temp;
		if(root==null)return;
		temp=root.left;
		root.left=root.right;
		root.right=temp;
		if(root.left!=null)
		Mirror(root.left);
		if(root.right!=null)
		Mirror(root.right);
	}

}

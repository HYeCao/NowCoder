/**
 * 
 */
package faceOffer;

/**输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度
 * @author dell
 *
 */
public class ExTree5_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int bestdeep=0;
	/**
	 * 思想：递归，回溯进行遍历，使用一个辅助变量统计深度，最后进行比较，类似于TSP
	 * 哈哈哈哈，一遍编译就直接通过，easy come easy go
	 * @param root
	 * @return
	 */
	public static  int TreeDepth(TreeNode root) {
		if(root==null)return 0;
		if(root.left==null&&root.right==null)return 1;
		ReDep(root, 0);
		return bestdeep;    
    }
	public static void ReDep(TreeNode root,int deep){
		if(root==null){
		if(deep>=bestdeep){
			bestdeep=deep;
		}
		}
		else {
			ReDep(root.left, deep+1);
			ReDep(root.right, deep+1);
		}
	}
}

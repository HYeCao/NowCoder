/**
 * 
 */
package faceOffer;

import java.util.ArrayList;


/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 二叉搜索树：右>根>左
 * 例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 * @author dell
 *
 */
public class ExTree2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 从小到大的顺序：中序遍历进行实现
	 * 
	 * @param pRoot
	 * @param k
	 * @return
	 */
    public static TreeNode KthNode(TreeNode pRoot, int k)
    {
    	if(k<=0)return null;
    	ArrayList<TreeNode> list=new ArrayList<TreeNode>();
    	PreTre(pRoot, list);
    	if(k>list.size())return null;
         return list.get(k-1);
    }
    public static void PreTre(TreeNode root,ArrayList<TreeNode> list){
    	if(root==null)return;
    	PreTre(root.left, list);
    	list.add(root);
    	PreTre(root.right, list);
    }
}

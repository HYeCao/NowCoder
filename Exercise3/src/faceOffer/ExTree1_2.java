/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 * @author dell
 *
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class ExTree1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isSymmetrical(TreeNode pRoot)
    {
		if(pRoot==null)return false;
		ArrayList<TreeNode> list=new ArrayList<TreeNode>();
		MidTree(pRoot, list);
		int end=list.size()-1;
//		if(list.get(list.size()/2)!=pRoot)return false;
		for(int i=0;i<(list.size()/2);i++){
			if(list.get(i).val!=list.get(end-i).val){//对称的结点值不相等
				return false;
			}
			if(list.get(i).val==list.get(end-i).val){//取巧，特殊情况叶节点的情况判断
				if(list.get(i).left!=null&&list.get(end-i).right==null)return false;
			}
		}
        return true;
    }
	public static void MidTree(TreeNode root,ArrayList<TreeNode> list){
		if(root==null)return ;
		MidTree(root.left, list);
		list.add(root);
		MidTree(root.right, list);
	}
}

/**
 * 
 */
package faceOffer_rest;

import java.util.ArrayList;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
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
public class Ex9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 
	 * @param pRootOfTree
	 * @return
	 */
	  public  TreeNode Convert(TreeNode pRootOfTree) {
		  if(pRootOfTree==null)return null;
	   ArrayList<TreeNode> list=new ArrayList<TreeNode>();
	   MidCon(pRootOfTree, list);
	   TreeNode root=list.get(0);
	   for(int i=1;i<list.size();i++){
		   root.right=list.get(i);
		   list.get(i).left=root;
		   root=list.get(i);
		   
	   }
	   
		  return list.get(0);     
	    }
	  public void MidCon(TreeNode root,ArrayList<TreeNode> list){
		  if(root==null)return;
		  MidCon(root.left, list);
		  list.add(root);
		  MidCon(root.right, list);
		  
	  }
	  /*
	   * public TreeNode Convert(TreeNode root)
    {
         
        if(root==null)return null;
        if(root.left==null&&root.right==null)return root;
        TreeNode left=Convert(root.left);
        TreeNode p=left;
        while(p!=null&&p.right!=null)
        {
            p=p.right;
        }
        if(left!=null)
        {
         p.right=root;
          root.left=p;
        }
       TreeNode right=Convert(root.right);
        if(right!=null)
         {
            root.right=right;
            right.left=root;
        }
         
      return  left!=null?left:root;  
    }
	   */
}

/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

import sun.misc.FpUtils;

/**
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 * @author dell
 *
 */
public class ExTree3_2 {

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
		System.out.println(FindPath(node1, 4));
	}
	/**
	 * 
	 * @param root
	 * @param target
	 * @return
	 */
	  public static  ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		  
//		  if(root==null)return null;此处不需要进行排空处理，因为接下来的判别函数进行了空值与空值的对比
//		  if(target==0)return null;
		  ArrayList<Integer> list=new ArrayList<Integer>();
		  ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
		 FPath(root, target, list, lists);
		  return lists;
	    }
	 
	  public static void FPath(TreeNode root,int path,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> lists){
		if(root==null)return;
		
		  if(root.left==null&&root.right==null){//是否为也叶节点
			if(path==root.val){
				list.add(root.val);
				lists.add(new ArrayList<Integer>(list));//此处需注意，因为需要新建进行赋值因此才可以继续对list进行操作
				list.remove(list.size()-1);
			}
			return;
		}
		/*
		 * 非叶节点时进行添加处理
		 */
		list.add(root.val);
		FPath(root.left, path-root.val, list, lists);
		FPath(root.right, path-root.val, list, lists);
		list.remove(list.size()-1);
	  }
}

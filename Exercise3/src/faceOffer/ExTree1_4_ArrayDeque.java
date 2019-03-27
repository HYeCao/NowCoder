/**
 * 
 */
package faceOffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * @author dell
 *
 */
public class ExTree1_4_ArrayDeque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> st1=new ArrayDeque<Integer>();
		st1.add(0);st1.add(1);st1.add(2);//队列的添加元素的方式
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		TreeNode node4=new TreeNode(4);
		TreeNode node5=new TreeNode(5);
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		Print(node1);
	}
	/**
	 * 
	 * @param pRoot
	 * @return
	 */
	public static  ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		 ArrayList<ArrayList<Integer>> lists=new  ArrayList<ArrayList<Integer>>();
		if(pRoot==null)return lists;
		Deque<TreeNode> st1=new ArrayDeque<TreeNode>();
	   
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    st1.add(pRoot);
	    list.add(st1.peek().val);
	    lists.add(list);
	    list=new ArrayList<Integer>();
	    while(!st1.isEmpty()){
	    	int size=st1.size();
	    	while(size>0){//现存结点的输出
	    		TreeNode node=st1.peek();
	    		if(node.left!=null){
	    		st1.add(node.left);
	    		list.add(node.left.val);
	    		}
	    		if(node.right!=null){
	    		st1.add(node.right);
	    		list.add(node.right.val);
	    		}
	    		st1.pop();
	    		size--;
	    	}
//	    	System.out.println(list);
	    	if(!list.isEmpty()){
	    	lists.add(list);}
	    	list=new ArrayList<Integer>();
	    }
		return lists;
    }
}

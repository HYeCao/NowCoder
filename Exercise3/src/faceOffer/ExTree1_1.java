/**
 * 
 */
package faceOffer;

import java.util.ArrayList;


/**
 * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء� 
 * ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
 * 
 * @author dell
 *
 */
class TreeLinkNode {
	int val;
	TreeLinkNode left = null;
	TreeLinkNode right = null;
	TreeLinkNode next = null;//ָ�򸸽��

	TreeLinkNode(int val) {
		this.val = val;
	}
}

public class ExTree1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeLinkNode node1=new TreeLinkNode(1);
		TreeLinkNode node2=new TreeLinkNode(2);
		TreeLinkNode node3=new TreeLinkNode(3);
		TreeLinkNode node4=new TreeLinkNode(4);
		TreeLinkNode node5=new TreeLinkNode(5);
		TreeLinkNode node6=new TreeLinkNode(6);
		TreeLinkNode node7=new TreeLinkNode(7);
		node1.left=node2;node1.right=node3;
		node2.left=node4;node2.right=node5;
		node3.left=node6;node3.right=node7;
		GetNext(node1);
	}

	/**
	 * 
	 * @param pNode
	 * @return
	 */
	public static TreeLinkNode GetNext(TreeLinkNode pNode) {
		ArrayList<TreeLinkNode> list=new ArrayList<TreeLinkNode>();
		if(pNode==null)return null;
		TreeLinkNode root=pNode;
		while(root.next!=null){
			root=root.next;
		}
		MidTree(root, list);
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals(pNode)){
				if(i==list.size()-1)return null;
				return list.get(i+1);
			}
		}
		return null;
	}
	public static void MidTree(TreeLinkNode root,ArrayList<TreeLinkNode> list){
		if(root==null)return ;
		MidTree(root.left, list);
		list.add(root);
		MidTree(root.right, list);
	}
}

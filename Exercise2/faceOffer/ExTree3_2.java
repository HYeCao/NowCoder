/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

import sun.misc.FpUtils;

/**
 * ����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����(ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
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
		  
//		  if(root==null)return null;�˴�����Ҫ�����ſմ�����Ϊ���������б��������˿�ֵ���ֵ�ĶԱ�
//		  if(target==0)return null;
		  ArrayList<Integer> list=new ArrayList<Integer>();
		  ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
		 FPath(root, target, list, lists);
		  return lists;
	    }
	 
	  public static void FPath(TreeNode root,int path,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> lists){
		if(root==null)return;
		
		  if(root.left==null&&root.right==null){//�Ƿ�ΪҲҶ�ڵ�
			if(path==root.val){
				list.add(root.val);
				lists.add(new ArrayList<Integer>(list));//�˴���ע�⣬��Ϊ��Ҫ�½����и�ֵ��˲ſ��Լ�����list���в���
				list.remove(list.size()-1);
			}
			return;
		}
		/*
		 * ��Ҷ�ڵ�ʱ������Ӵ���
		 */
		list.add(root.val);
		FPath(root.left, path-root.val, list, lists);
		FPath(root.right, path-root.val, list, lists);
		list.remove(list.size()-1);
	  }
}

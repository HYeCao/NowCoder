/**
 * 
 */
package faceOffer;

import java.util.ArrayList;


/**
 * ����һ�ö��������������ҳ����еĵ�kС�Ľ�㡣
 * ��������������>��>��
 * ���磬 ��5��3��7��2��4��6��8��    �У��������ֵ��С˳�����С����ֵΪ4��
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
	 * ��С�����˳�������������ʵ��
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

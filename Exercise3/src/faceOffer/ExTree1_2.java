/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

/**
 * ��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�
 * ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
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
			if(list.get(i).val!=list.get(end-i).val){//�ԳƵĽ��ֵ�����
				return false;
			}
			if(list.get(i).val==list.get(end-i).val){//ȡ�ɣ��������Ҷ�ڵ������ж�
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

/**
 * 
 */
package faceOffer;

/**����һ�ö����������������ȡ�
 * �Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ�������
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
	 * ˼�룺�ݹ飬���ݽ��б�����ʹ��һ����������ͳ����ȣ������бȽϣ�������TSP
	 * ����������һ������ֱ��ͨ����easy come easy go
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

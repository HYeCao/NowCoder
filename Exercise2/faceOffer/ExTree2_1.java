/**
 * 
 */
package faceOffer;

/**
 * ����ݹ�����
 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ��
 *��ps������Լ��������������һ�������ӽṹ��
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
public class ExTree2_1 {

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
		TreeNode tr1=new TreeNode(2);
		TreeNode tr2=new TreeNode(4);
		TreeNode tr3=new TreeNode(5);
		tr1.left=tr2;
		tr1.right=tr3;
		System.out.println(HasSubtree(node1, tr1));
	}
	/**
	 * ���˼�룺���յݹ��˼��ʵ�����ı������ҵ���������ͬ�ĸ��ڵ㣬
	 *           ֮���������ڵ��������ҵ��Ľ����жԱ�
	 * �ѵ㣺�ڻ�ȡһ����ͬ�����б�������ӽṹ���Ծ���Ҫ�������������������б����ʹ�õݹ�ķ�������ʵ�֣�
	 * @param root1
	 * @param root2
	 * @return
	 */
	    public static  boolean HasSubtree(TreeNode root1,TreeNode root2) {
	    	if(root2==null) return false;
	        if(root1==null && root2!=null) return false;       
	        boolean flag = false;
	        if(root1.val==root2.val){
	            flag = isSubTree(root1,root2);
	        }
	        if(!flag){
	            flag = HasSubtree(root1.left, root2);
	            if(!flag){
	                flag = HasSubtree(root1.right, root2);
	            }
	        }
	        return flag;
	    }
	     /**
	      * ��������������ͬʱ�Ƚϣ���Ҫ�����  
	      * @param root1
	      * @param root2
	      * @return
	      */
	    private static boolean isSubTree(TreeNode root1, TreeNode root2) {
	        if(root2==null) return true;
	        if(root1==null && root2!=null) return false;       
	        if(root1.val==root2.val){
	            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
	        }else{
	        return false;
	        }
}
}
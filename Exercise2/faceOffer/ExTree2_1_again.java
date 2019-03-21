/**
 * 
 */
package faceOffer;

/**
 * 常与递归相结合
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 *（ps：我们约定空树不是任意一个树的子结构）
 * @author dell
 *
 */
public class ExTree2_1_again {

	/**注意增强代码的鲁棒性
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
	public static  boolean HasSubtree(TreeNode root1,TreeNode root2){
		if(root1==null)return false;//此步判断必不可少
		if(root2==null)return false;
		boolean flag=false;
		if(root1.val==root2.val){
//			System.out.println("test1");
			flag=isSubTree(root1,root2);
		}
		if(!flag){
			flag=HasSubtree(root1.left, root2);
		if(!flag){
			flag=HasSubtree(root1.right, root2);
		}
		}
		return flag;
	}
	/**
	 * 对于根节点值相同的点进行判断是否子树相同
	 * @param root1
	 * @param root2
	 * @return
	 */
	public static boolean isSubTree(TreeNode root1,TreeNode root2){
		if(root1==null&&root2!=null)return false;
		if(root2==null){//root2是子树，只要其遍历完成便可判别其真假，不需要判断root1
			return true;
		}
		
		if(root1.val==root2.val){
			return isSubTree(root1.left, root2.left)&&isSubTree(root1.right, root2.right);
		}
		else return false ;
	}
}

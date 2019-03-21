/**
 * 
 */
package faceOffer;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。 如果是则输出Yes,否则输出No。 假设输入的数组的任意两个数字都互不相同
 * 补充：二叉搜索树：若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值； 
 * 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值； 它的左、右子树也分别为二叉排序树。
 * 
 * @author dell 结合二叉搜索树的特点可以使用递归的定义判别大小关系进行实现
 */
public class ExTree3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 
	 * @param sequence
	 * @return
	 */
	   public static boolean VerifySquenceOfBST(int [] sequence) {
		   int len=sequence.length;
		   int root=sequence[len-1];//获取根节点
		   Squ(sequence, 0, len);
		   return false;      
	   }
	   /**
	    * 重点：返回的条件   赋值的数据  起止两个结点
	    * @param tree
	    * @param start
	    * @param end
	    * @return
	    */
	   public static boolean Squ(int[] tree,int start,int end){
		   if(start>=end)return true;//头尾相遇说明遍历完成
		   int i=start;//i赋值为起始结点
		   int j=0;
		   for(;i<end;i++){
			   if(tree[i]>tree[end])break;
		   }
		   for(j=i;j<end;j++){
			   if(tree[j]<tree[end])return false;
		   }
//		   Squ(tree,i,j);
		   return Squ(tree,0,i-1)&&Squ(tree,i,j-1);
	   }
}

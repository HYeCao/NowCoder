/**
 * 
 */
package faceOffer;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。 如果是则输出Yes,否则输出No。 假设输入的数组的任意两个数字都互不相同
 * 补充：二叉搜索树：若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值； 
 * 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值； 它的左、右子树也分别为二叉排序树。
 * 
 * @author dell
 *
 */
public class ExTree3_1_again {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = null;
		int[] s1={};
		/*
		 * s与s1意义不同，需要多加考虑
		 */
		System.out.println(s.length);
		if(s==null)
		System.out.println("00");
		
	}
	  public static boolean VerifySquenceOfBST(int [] sequence) {
		  if(sequence.length==0)return false;
		  int len=sequence.length;
		  return VerT(sequence, 0, len-1);
//		   return false;      
	   }
	  public static boolean VerT(int[] seq,int start,int end){
		  if(start>=end)return true;
		  int i=start;
		  int j=0;
		  for(;i<end;i++){
			  if(seq[i]>seq[end])break;
		  }
		  for(j=i;j<end;j++){
			  if(seq[j]<seq[end])return false;
		  }
		  return VerT(seq, 0,j-1)&&VerT(seq, i, j-1);
	  }
}

/**
 * 
 */
package faceOffer;

/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ���� ����������Yes,�������No�� �������������������������ֶ�������ͬ
 * ���䣺���������������������������գ��������������н���ֵ��С�����ĸ�����ֵ�� 
 * ���������������գ��������������н���ֵ���������ĸ�����ֵ�� ������������Ҳ�ֱ�Ϊ������������
 * 
 * @author dell ��϶������������ص����ʹ�õݹ�Ķ����б��С��ϵ����ʵ��
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
		   int root=sequence[len-1];//��ȡ���ڵ�
		   Squ(sequence, 0, len);
		   return false;      
	   }
	   /**
	    * �ص㣺���ص�����   ��ֵ������  ��ֹ�������
	    * @param tree
	    * @param start
	    * @param end
	    * @return
	    */
	   public static boolean Squ(int[] tree,int start,int end){
		   if(start>=end)return true;//ͷβ����˵���������
		   int i=start;//i��ֵΪ��ʼ���
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

/**
 * 
 */
package faceOffer;

/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ���� ����������Yes,�������No�� �������������������������ֶ�������ͬ
 * ���䣺���������������������������գ��������������н���ֵ��С�����ĸ�����ֵ�� 
 * ���������������գ��������������н���ֵ���������ĸ�����ֵ�� ������������Ҳ�ֱ�Ϊ������������
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
		 * s��s1���岻ͬ����Ҫ��ӿ���
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

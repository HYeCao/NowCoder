/**
 * 
 */
package faceOffer;

/**
 * ��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
 * @author dell
 *
 */
public class ExNum2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**����˼·��1.�������߼���Ķ�·����ʵ�ֵݹ���ֹ��
	             2.��n==0ʱ��(n>0)&&((sum+=Sum_Solution(n-1))>0)ִֻ��ǰ����жϣ�Ϊfalse��Ȼ��ֱ�ӷ���0��     
	             3.��n>0ʱ��ִ��sum+=Sum_Solution(n-1)��ʵ�ֵݹ����Sum_Solution(n)��
	   **/
	   public int Sum_Solution(int n) {
	         int sum = n;
	        boolean flag = (sum>0)&&((sum+=Sum_Solution(--n))>0);
	        return sum;
	    }
}

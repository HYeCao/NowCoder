/**
 * 
 */
package faceOffer;

/**
 * ���θ���
 * ��n��2*1��С�������ظ��ĸ���һ��2*n�Ĵ���Σ��ܹ������ַ�ʽ��С���κ��ŷŻ������ŷţ�
 * �򵥵ĵݹ����
 *  @author dell
 *
 */
public class Ex3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Cover(4));
	}
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int Cover(int n){
		if(n==1)return 1;
		else if(n==2) return 2;
		else {
		return Cover(n-1)+Cover(n-2);
//		return 0;
		}
	}
}

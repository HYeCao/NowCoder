/**
 * 
 */
package faceOffer;

/**
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 * ���͵Ķ�̬�滮
 * @author dell
 *
 */
public class Ex1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MatrixF(4));
	}

	public static int MatrixF(int n){
		if(n==1)return 1;
		if(n==2)return 2;
		if(n==0)return 0;
		int num=0;
		num=MatrixF(n-1)+MatrixF(n-2);
		return num;
	}
}

/**
 * 
 */
package faceOffer;

/**
 * ������̨��
 * 쳲��������е�Ӧ��
 * f(n)=f(n-1)+f(n-2)  n=1 f(1)=1  n=2 f(n)=2
 * @author dell
 *
 */
public class Ex2_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fib(3));//���Դ���
	}
	/**
	 * 쳲��������еĵݹ�ʵ�֣�ע��ݹ����������ȷ�����б�
	 * @param n
	 * @return
	 */
	public static int Fib(int n){
		if(n==1)return 1;
		if(n==2)return 2;
		else {
			return Fib(n-1)+Fib(n-2);
		}
	}
}

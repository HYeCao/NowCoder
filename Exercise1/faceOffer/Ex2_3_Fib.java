/**
 * 
 */
package faceOffer;

/**
 * 쳲��������е�ʵ��
 * f(n)=f(n-1)+f(n-2)
 * �ݹ����ʵ��
 * @author dell
 *
 */
public class Ex2_3_Fib {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fib(300));
	}
	/**
	 * ���ջ��������뷽�̣��򵥵ĵݹ�ʵ��
	 * @param x
	 * @return
	 */
	public static int Fib(int x)
	{
		if(x==0)return 0;
		if(x==1)return 1;
		else {
			return Fib(x-1)+Fib(x-2);
		}
	}

}

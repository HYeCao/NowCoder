/**
 * 
 */
package faceOffer;

/**
 * 斐波那契数列的实现
 * f(n)=f(n-1)+f(n-2)
 * 递归进行实现
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
	 * 掌握基本概念与方程，简单的递归实现
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

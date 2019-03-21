/**
 * 
 */
package faceOffer;

/**
 * 青蛙跳台阶
 * 斐波那契数列的应用
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
		System.out.println(Fib(3));//测试代码
	}
	/**
	 * 斐波那契数列的递归实现（注意递归结束条件的确定与判别）
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

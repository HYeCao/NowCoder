/**
 * 
 */
package faceOffer;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 典型的动态规划
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

/**
 * 
 */
package faceOffer;

/**
 * 矩形覆盖
 * 用n个2*1的小矩形无重复的覆盖一个2*n的大矩形，总共多少种方式（小矩形横着放或者竖着放）
 * 简单的递归调用
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

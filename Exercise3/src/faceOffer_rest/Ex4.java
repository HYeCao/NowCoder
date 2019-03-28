/**
 * 
 */
package faceOffer_rest;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author dell
 *
 */
public class Ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 递归实现：总结归纳法
	 * @param target
	 * @return
	 */
	public static int JumpFloorII(int target) {
		  if (target <= 0) {
	            return -1;
	        } else if (target == 1) {
	            return 1;
	        } else {
	            return 2 * JumpFloorII(target - 1);
        }
    }	 
    
}

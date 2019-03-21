/**
 * 
 */
package faceOffer;

/**
 * 数值的整数次方
 * base:double exp:int 求base的exp次方
 * （快速幂的实现：幂次的移位操作的实现，降低时间复杂度）
 * @author dell
 *
 */
public class Ex3_3_FastPow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base = 5;
		int    exp = 3;
		if(base==0)System.out.println(0);
		int absExp=Math.abs(exp);
		double result=PowExp(base, absExp);
		if(exp<0){
			result=1.0/result;
		}
		System.out.println(result);
		
	}
	public static double PowExp(double base,int exp){
		if(exp==0)return 1;
		if(exp==1)return base;
		double res=PowExp(base, exp>>1);//通过移位进行计算
		res *=res;
		if((exp & 0x1)==1){//如果指数为奇数，则要再乘一次底数base
			res*=base;
		}
		return res;
	}
}

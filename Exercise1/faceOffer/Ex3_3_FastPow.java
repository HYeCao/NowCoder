/**
 * 
 */
package faceOffer;

/**
 * ��ֵ�������η�
 * base:double exp:int ��base��exp�η�
 * �������ݵ�ʵ�֣��ݴε���λ������ʵ�֣�����ʱ�临�Ӷȣ�
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
		double res=PowExp(base, exp>>1);//ͨ����λ���м���
		res *=res;
		if((exp & 0x1)==1){//���ָ��Ϊ��������Ҫ�ٳ�һ�ε���base
			res*=base;
		}
		return res;
	}
}

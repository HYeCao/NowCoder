/**
 * 
 */
package faceOffer;

/**
 * ��ֻ����������2��3��5��������������Ugly Number����
 * ����6��8���ǳ�������14���ǣ���Ϊ������������7�� 
 * ϰ�������ǰ�1�����ǵ�һ��������
 * �󰴴�С�����˳��ĵ�N��������
 * @author dell
 *
 */
public class ExNum1_2_TimeOut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(14%2);
		System.out.println(GetUglyNumber_Solution(200));
	}
	/**
	 * 
	 * @param index
	 * @return
	 */
	 public static int GetUglyNumber_Solution(int index) {
		int num=1;
		int fin=0;
		 for(int i=0;;i++){
			if(isUgNum(i)){
				num++;
			}
			if(num==index){
				fin=i;
				break;
			}
		}
		 return fin;
	 }
	 public static boolean isUgNum(double num){
		int x=1;
		 for(int i=0;x<num;i=i++){
			x=x*6;
			if(x==num)return true;
		}
		 x=1;
		 for(int i=0;x<num;i=i++){
			x=x*10;
			if(x==num)return true;
		}
		 x=1;
		 for(int i=0;x<num;i=i++){
			x=x*15;
			if(x==num)return true;
		}
		 x=1;
		for(int i=0;x<num;i=i++){
			x=x*2;
			if(x==num)return true;
		}
		 x=1;
		 for(int i=0;x<num;i=i++){
			x=x*3;
			if(x==num)return true;
		}
		 x=1;
		 for(int i=0;x<num;i=i++){
			x=x*5;
			if(x==num)return true;
		}
		
		 return false;
	 }
}

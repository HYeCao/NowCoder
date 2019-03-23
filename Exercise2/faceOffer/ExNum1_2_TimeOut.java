/**
 * 
 */
package faceOffer;

/**
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。 
 * 习惯上我们把1当做是第一个丑数。
 * 求按从小到大的顺序的第N个丑数。
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

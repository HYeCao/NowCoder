/**
 * 
 */
package faceOffer;

/**
 *  ��ֻ����������2��3��5��������������Ugly Number����
 * ����6��8���ǳ�������14���ǣ���Ϊ������������7�� 
 * ϰ�������ǰ�1�����ǵ�һ��������
 * �󰴴�С�����˳��ĵ�N��������
 * ����˼�룺������������ɵ����϶����������������ɵģ���������������������ɵ���������
 * @author dell
 *
 */
public class ExNum1_2_final {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GetUglyNumber_Solution(10));
	}
	/**
	 * 
	 * @param index
	 * @return
	 */
	 public static int GetUglyNumber_Solution(int index) {
	    if(index==0)return 0;
		 int[] res=new int[index];
		res[0]=1; 
	    int count=0;
	    int i2=0,i3=0,i5=0;
	    int tmp=0;
	    while(count<index-1){
	    	tmp=min(res[i2]*2,min(res[i3]*3,res[i5]*5));
	    	if(tmp==res[i2]*2)i2++;
	    	if(tmp==res[i3]*3)i3++;
	    	if(tmp==res[i5]*5)i5++;
	    	res[++count]=tmp;
	    }
		 return res[index-1];
	    }
	 public static int min(int x,int y){
		 if(x>y)return y;
		 else return x;
	 }
}

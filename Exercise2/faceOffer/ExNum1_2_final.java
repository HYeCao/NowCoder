/**
 * 
 */
package faceOffer;

/**
 *  把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。 
 * 习惯上我们把1当做是第一个丑数。
 * 求按从小到大的顺序的第N个丑数。
 * 解题思想：由着三个数组成的数肯定是由这三个数构成的，所以求解有这三个数构成的数就行了
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

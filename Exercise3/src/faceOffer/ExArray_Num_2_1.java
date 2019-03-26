/**
 * 
 */
package faceOffer;

/**
 * 圆圈中最后剩下的数
 * @author dell
 *
 */
public class ExArray_Num_2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastRemaining_Solution(5, 3);
	}
	/*
	 * 用数组实现的循环，关键点：搞清特殊点的情况，限制条件不要过多，记得整合统一处理额条件，减少代码的冗余
	 */
	 public static  int LastRemaining_Solution(int n, int m) {
	     int[] num=new int[n];
	     int temp=0;
	     int count=n;
	     int step=0;
	     int i=-1;
	     while(count>0){
	    	 i++;
	    	 if(i>=n)i=0;
	    	 if(num[i]==-1)continue;
	    	 step++;
	    	 if(step==m){
	    		 num[i]=-1;
	    		 count--;
	    		 step=0;
	    	 }
	     }
//	     System.out.println(i);
		 return i;  
	    }
}

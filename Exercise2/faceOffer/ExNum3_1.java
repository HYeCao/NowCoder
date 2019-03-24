/**
 * 
 */
package faceOffer;

/**
 * 统计一个数字在排序数组中出现的次数
 * @author dell
 *
 */
public class ExNum3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 思想：1.简单方法：使用直接查找进行查找
	 *       2.由于数组是已经排序的，所以考虑使用二分查找进行实现
	 * @param array
	 * @param k
	 * @return
	 */
	public int GetNumberOfK(int [] array , int k) {
	   int num=0;
	   for(int i=0;i<array.length;i++){
		   if(array[i]==k)num++;
	   }
		return num;    
    }
}

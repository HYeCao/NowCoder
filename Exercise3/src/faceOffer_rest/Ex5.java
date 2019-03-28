/**
 * 
 */
package faceOffer_rest;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 * @author dell
 *
 */
public class Ex5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 思路：计算出所有的解，然后选出最大的一个
	 * @param array
	 * @return
	 */
	public static int FindGreatestSumOfSubArray(int[] array) {
		int max=array[0];
		int temp=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<array.length-1;i++){
			for(int j=i;j<array.length;j++){
				temp+=array[j];
				list.add(temp);
			}
			temp=0;
		}
		Collections.sort(list);
		return list.get(list.size()-1);    
    }
}

/**
 * 
 */
package faceOffer_rest;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ��һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)
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
	 * ˼·����������еĽ⣬Ȼ��ѡ������һ��
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

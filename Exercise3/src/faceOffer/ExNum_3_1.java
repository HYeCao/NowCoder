/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ����ʹ��Insert()������ȡ��������ʹ��GetMedian()������ȡ��ǰ��ȡ���ݵ���λ����
 * 
 * @author dell
 *
 */
public class ExNum_3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insert(5);
		GetMedian();
	}

	static ArrayList<Integer> list=new ArrayList<Integer>();
	/**
	 * ��������
	 * @param num
	 */
	public static void Insert(Integer num) {
		list.add(num);
		
	}
	/**
	 * ��ȡ��ǰ����λ��
	 * ��ֵ��Ҫ����
	 * @return
	 */
	public static Double GetMedian() {
		int size=list.size();
		if(size==1)return (double)list.get(0);
		if(size%2!=0){
			Collections.sort(list);
			Double min;
			min=(double)list.get(size/2);
			return min;
		}
		else{
			Double d1,d2;
			Collections.sort(list);
			d1=(double)list.get(size/2);
			d2=(double)list.get(size/2-1);
			d1=(d1+d2)/2;
			return d1;
		}
	}
}

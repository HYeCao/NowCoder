/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
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
	 * 插入数据
	 * @param num
	 */
	public static void Insert(Integer num) {
		list.add(num);
		
	}
	/**
	 * 获取当前的中位数
	 * 数值需要排序
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

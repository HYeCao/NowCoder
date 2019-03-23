/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * 初步思想：本题使用回溯法，但是无法进行，因为操作的交换是字符串string不是cha因此swap交换时无法完成
 * 换一种思路：
 * @author dell
 *
 */
public class ExArray1_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={3,5,1,4,2};
		System.out.println(PrintMinNumber(num));
	}
	/**
	 * 
	 * @param numbers
	 * @return
	 */
	 public static String PrintMinNumber(int [] numbers) {
		 String[] strs=new String[numbers.length];
		 for(int i=0;i<numbers.length;i++){
			 strs[i]=String.valueOf(numbers[i]);
		 }
		 StringBuilder sb=new StringBuilder();//存储一个组合数，再封装至lists里面
		 ArrayList<Integer> lists=new ArrayList<Integer>();//存储所有的组合数
		 GetStr(0,strs,lists);//
		 Collections.sort(lists);
		 return String.valueOf(lists.get(0));
	}
	 public static void GetStr(int start,String[] strs,ArrayList<Integer> list){
		 if(start>=strs.length){
			 String str=new String();
			 for(int i=0;i<strs.length;i++){
				 str +=strs[i];
			 }
//			 System.out.println(str);
			 list.add(Integer.parseInt(str));

		 }
		 else {
			 for(int i=start;i<strs.length;i++){
				 swap(strs,i,start);
				 GetStr(i+1, strs, list);
				 swap(strs,  i,start);
				 
			 }
		 }
	 }
	 public static void swap(String[] strs,int i,int start){
		 String st=strs[i];
		 strs[i]=strs[start];
		 strs[start]=st;
	 }
}

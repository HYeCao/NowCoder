/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 * ����˼�룺����ʹ�û��ݷ��������޷����У���Ϊ�����Ľ������ַ���string����cha���swap����ʱ�޷����
 * ��һ��˼·��
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
		 StringBuilder sb=new StringBuilder();//�洢һ����������ٷ�װ��lists����
		 ArrayList<Integer> lists=new ArrayList<Integer>();//�洢���е������
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

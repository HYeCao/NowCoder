/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

/**
 * @author dell
 *
 */
public class ExArrayList_Num_3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5,0};
		int[] b={2,3,4,6,5,3};
		LargeSZ(a, b);
		
	}
	public static void LargeSZ(int[] a,int[] b){
		ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		int size=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){//�ҵ���һ����ͬ��Ԫ��
					while(a[i]==b[j]&&i<a.length&&j<b.length){
						list.add(a[i]);//��ͬԪ��������б��У�ֱ�����ֲ���ͬ��һ��
						i++;j++;
						
					}
					lists.add(list);//��ͬԪ���б����
					list=new ArrayList<Integer>();
				}
		
			}
		}
		int i=0;
		size=0;
		/*
		 * ѡ���������������
		 */
		for(int j=0;j<lists.size();j++){
			if(lists.get(j).size()>size){
				size=lists.get(j).size();
				i=j;
			}
		}
		System.out.println(lists.get(i));
	}
	
}

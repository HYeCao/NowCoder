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
				if(a[i]==b[j]){//找到第一个相同得元素
					while(a[i]==b[j]&&i<a.length&&j<b.length){
						list.add(a[i]);//相同元素添加至列表中，直至出现不相同得一个
						i++;j++;
						
					}
					lists.add(list);//相同元素列表加入
					list=new ArrayList<Integer>();
				}
		
			}
		}
		int i=0;
		size=0;
		/*
		 * 选择出长度最大得数组
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

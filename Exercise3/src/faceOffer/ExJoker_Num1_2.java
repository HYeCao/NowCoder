/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Σ� 
 * ����������˳�Ӿ����true����������false��Ϊ�˷������,�������Ϊ��С����0��
 * @author dell
 *
 */
public class ExJoker_Num1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={0,2,4,6,3};
		System.out.println(isContinuous(num));
	}
	/*
	 * 
	 */
	public static boolean isContinuous(int [] numbers) {
		if(numbers.length==0)return false;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<numbers.length;i++){
			list.add(numbers[i]);
		}
		Collections.sort(list);
		if(list.contains(0)){
			
			if(list.get(3)==0)return true;//�ĸ���
			else if(list.get(2)==0){
				if(list.get(4)==list.get(3))return false;
				if(list.get(4)-list.get(3)<=4)return true;
				return false;
			}
			else if(list.get(1)==0){
				if(list.get(4)-list.get(2)<=4)return true;
				return false;
			}
			else if(list.get(0)==0){
				System.out.println(list.get(0));
				if(list.get(4)-list.get(1)<=4){
					return true;
				}
				return false;
			}
		}
		
		else{
			if(list.get(4)-list.get(0)==4){
			return true;
		}
		}
		return false;
    }
}

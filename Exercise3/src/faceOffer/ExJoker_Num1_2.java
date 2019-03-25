/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何， 
 * 如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。
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
			
			if(list.get(3)==0)return true;//四个王
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

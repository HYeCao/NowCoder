/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author dell
 *
 */
public class ExArray1_3_final {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String PrintMinNumber(int [] numbers) {
		String[] strs=new String[numbers.length];
		ArrayList<Integer> lists=new ArrayList<Integer>();//存储所有的组合数 
		for(int i=0;i<numbers.length;i++){
			 lists.add(numbers[i]);
		 }
		 
		 Collections.sort(lists,new Comparator<Integer>() {
			 @Override
	            public int compare(Integer str1, Integer str2) {
	                // TODO Auto-generated method stub          
	                    String s1=str1+""+str2;
	                    String s2=str2+""+str1;
	                     
	                    return s1.compareTo(s2);
	                }
		});
		 String s="";
		 for(int j=0;j<lists.size();j++){
			 s+=lists.get(j);
		 }
		return s;
    }
}

/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

/**
 * @author dell
 *
 */
public class ExNum2_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
    	if(numbers==null){
    		duplication[0]=-1;
            return false;
    	}
    	if(numbers.length<=0){
    		duplication[0]=-1;
    		return false;
    	}
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	int j=0;
    	for(int i=0;i<length;i++){
    		if(list.contains(numbers[i])){
    			duplication[j]=numbers[i];
    			return true;
    		}
    		else {
    			list.add(numbers[i]);
    		}
    	}
    	return false;
    	
    }
}

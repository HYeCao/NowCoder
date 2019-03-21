/**
 * 
 */
package huaWeiMath;

/**
 * @author dell
 *
 */
public class MOMath2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public void sort(int[] array, int len) {
	        // 完成这个函数
		 int temp=0;
		 for(int i=0;i<len;i++){
		    if(array[i]!=i){
		    	
		    	for(int j=i;j<len;j++){
		    		if(array[j]==i)temp=j;//获取需要交换的数字的位置
		    		// i 当前所在的位置下标
		    	}

//		    	swapWithZero(array, len, array[temp]);
//		    	swapWithZero(array, len,  array[i]);
//		    	swapWithZero(array, len,  array[0]); 
		    }
		    
		 }
	    }
}

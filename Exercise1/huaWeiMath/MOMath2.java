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
	        // ����������
		 int temp=0;
		 for(int i=0;i<len;i++){
		    if(array[i]!=i){
		    	
		    	for(int j=i;j<len;j++){
		    		if(array[j]==i)temp=j;//��ȡ��Ҫ���������ֵ�λ��
		    		// i ��ǰ���ڵ�λ���±�
		    	}

//		    	swapWithZero(array, len, array[temp]);
//		    	swapWithZero(array, len,  array[i]);
//		    	swapWithZero(array, len,  array[0]); 
		    }
		    
		 }
	    }
}

/**
 * 
 */
package faceOffer_rest;


/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� 
 * ����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� 
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * @author dell
 *
 */
public class Ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 
	 * @param array
	 * @return
	 */
	 public int minNumberInRotateArray(int [] array) {
		if(array.length==0)
		 return 0;    
		else {
			int min=array[0];
			for(int i=0;i<array.length;i++){
				if(array[i]<min)min=array[i];
				
			}
			return min;
		}
	    }
}

/**
 * 
 */
package faceOffer;

/**
 * ͳ��һ�����������������г��ֵĴ���
 * @author dell
 *
 */
public class ExNum3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * ˼�룺1.�򵥷�����ʹ��ֱ�Ӳ��ҽ��в���
	 *       2.�����������Ѿ�����ģ����Կ���ʹ�ö��ֲ��ҽ���ʵ��
	 * @param array
	 * @param k
	 * @return
	 */
	public int GetNumberOfK(int [] array , int k) {
	   int num=0;
	   for(int i=0;i<array.length;i++){
		   if(array[i]==k)num++;
	   }
		return num;    
    }
}

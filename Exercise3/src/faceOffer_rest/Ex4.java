/**
 * 
 */
package faceOffer_rest;

/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
 * @author dell
 *
 */
public class Ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * �ݹ�ʵ�֣��ܽ���ɷ�
	 * @param target
	 * @return
	 */
	public static int JumpFloorII(int target) {
		  if (target <= 0) {
	            return -1;
	        } else if (target == 1) {
	            return 1;
	        } else {
	            return 2 * JumpFloorII(target - 1);
        }
    }	 
    
}

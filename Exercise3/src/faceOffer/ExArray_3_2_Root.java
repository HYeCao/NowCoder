/**
 * 
 */
package faceOffer;

/**
 * �����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����
 * ·�����ԴӾ����е�����һ�����ӿ�ʼ��ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ�
 * 
 * @author dell
 *
 */
public class ExArray_3_2_Root {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch={'a','b','c','e','s','f','c','s','a','d','e','e'};
		char[] str={'b','c','c','e','d'};
		hasPath(ch, 3, 4, str);
		
	}

	public static  boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
//		char first;
		int x=0,y=0;
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(str[0]==matrix[i+j]){//�ҵ���һ����ͬ��Ԫ��
					x=i;y=j;
				}
			}
		}
		System.out.println(matrix[x+y]);
		return false;
	}
	/**
	 * ����˼�룺ʹ�õݹ����ʵ�֣�ͬʱ������һ���߹��Ľ��λ�����꣬�Է��ظ�
	 * �𰸣�˼·һֱ��ʹ�û��ݽ������
	 * @param matx
	 * @param x
	 * @param y
	 * @param str
	 * @param px
	 * @param py
	 */
	public static void hasRoot(int[] matx,int x,int y,char[] str,int px,int py){
		
	}
	/*
	 *  public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        int flag[] = new int[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (helper(matrix, rows, cols, i, j, str, 0, flag))
                    return true;
            }
        }
        return false;
    }
 
    private boolean helper(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
        int index = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || flag[index] == 1)
            return false;
        if(k == str.length - 1) return true;
        flag[index] = 1;
        if (helper(matrix, rows, cols, i - 1, j, str, k + 1, flag)
                || helper(matrix, rows, cols, i + 1, j, str, k + 1, flag)
                || helper(matrix, rows, cols, i, j - 1, str, k + 1, flag)
                || helper(matrix, rows, cols, i, j + 1, str, k + 1, flag)) {
            return true;
        }
        flag[index] = 0;
        return false;
    }
    */
	 
}

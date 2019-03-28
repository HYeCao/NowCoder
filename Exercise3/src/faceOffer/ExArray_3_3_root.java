/**
 * 
 */
package faceOffer;

/**
 * ������һ��m�к�n�еķ���һ�������˴�����0,0�ĸ��ӿ�ʼ�ƶ���ÿһ��ֻ�������ң��ϣ����ĸ������ƶ�һ��
 * ���ǲ��ܽ�������������������λ֮�ʹ���k�ĸ��ӡ� 
 * ���磬��kΪ18ʱ���������ܹ����뷽��35,37������Ϊ3+5+3+7 = 18��
 * ���ǣ������ܽ��뷽��35,38������Ϊ3+5+3+8 = 19�����ʸû������ܹ��ﵽ���ٸ����ӣ�
 * @author dell
 *
 */
public class ExArray_3_3_root {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 
	 * @param threshold
	 * @param rows
	 * @param cols
	 * @return
	 */
	 public int movingCount(int threshold, int rows, int cols)
	    {
	        boolean[] visited=new boolean[rows*cols];//λ����Ϣ�����б�����
	        return movingCountCore(threshold, rows, cols, 0,0,visited);
	    }
	    private int movingCountCore(int threshold, int rows, int cols,
	            int row,int col,boolean[] visited) {
	        if(row<0||row>=rows||col<0||col>=cols) return 0;//����λ�õ��Ｋ��
	        int i=row*cols+col;//��ǰ���ʵĽ���λ���б���Ϣ
	        if(visited[i]||!checkSum(threshold,row,col)) return 0;//��ǰ�ڵ㲻ͨ������0
	        visited[i]=true;//��ǰ���ͨ��������λ����ϢΪ�棬����·�����ظ�ͬ��
	        return 1+movingCountCore(threshold, rows, cols,row,col+1,visited)//������
	                +movingCountCore(threshold, rows, cols,row,col-1,visited)//������
	                +movingCountCore(threshold, rows, cols,row+1,col,visited)//������
	                +movingCountCore(threshold, rows, cols,row-1,col,visited);//������
	    }
	    /**
	     * ��ǰλ�õ���Ϣ�б��Ƿ�������Ŀ������
	     * @param threshold
	     * @param row
	     * @param col
	     * @return
	     */
	    private boolean checkSum(int threshold, int row, int col) {
	        int sum=0;
	        while(row!=0){//����λ�Ĳ��
	            sum+=row%10;
	            row=row/10;
	        }
	        while(col!=0){//����λ�Ĳ��
	            sum+=col%10;
	            col=col/10;
	        }
	        if(sum>threshold) return false;
	        return true;
	    }
}

/**
 * 
 */
package faceOffer;

/**
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
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
	        boolean[] visited=new boolean[rows*cols];//位置信息辅助判别数组
	        return movingCountCore(threshold, rows, cols, 0,0,visited);
	    }
	    private int movingCountCore(int threshold, int rows, int cols,
	            int row,int col,boolean[] visited) {
	        if(row<0||row>=rows||col<0||col>=cols) return 0;//坐标位置到达极点
	        int i=row*cols+col;//当前访问的结点的位置判别信息
	        if(visited[i]||!checkSum(threshold,row,col)) return 0;//当前节点不通过返回0
	        visited[i]=true;//当前结点通过，设置位置信息为真，便于路径的重复同行
	        return 1+movingCountCore(threshold, rows, cols,row,col+1,visited)//向下走
	                +movingCountCore(threshold, rows, cols,row,col-1,visited)//向上走
	                +movingCountCore(threshold, rows, cols,row+1,col,visited)//向右走
	                +movingCountCore(threshold, rows, cols,row-1,col,visited);//向左走
	    }
	    /**
	     * 当前位置的信息判别，是否满足题目的条件
	     * @param threshold
	     * @param row
	     * @param col
	     * @return
	     */
	    private boolean checkSum(int threshold, int row, int col) {
	        int sum=0;
	        while(row!=0){//行数位的拆分
	            sum+=row%10;
	            row=row/10;
	        }
	        while(col!=0){//列数位的拆分
	            sum+=col%10;
	            col=col/10;
	        }
	        if(sum>threshold) return false;
	        return true;
	    }
}

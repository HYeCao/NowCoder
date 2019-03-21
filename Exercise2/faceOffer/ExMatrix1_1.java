/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 *       则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author dell
 *
 */
public class ExMatrix1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		System.out.println(matrix[1].length);
		printMatrix(matrix);
	}
	/**
	 * 方法一：多设定几个参数进行实现
	 *        起始行数，起始列数，终止行数，终止列数
	 * 方法二：层数计算进行按层计算
	 * @param matrix
	 * @return
	 */
	 public static ArrayList<Integer> printMatrix(int [][] array) {
			    ArrayList<Integer> result = new ArrayList<Integer> ();        
			    if(array.length==0) return result;        
			    int n = array.length,m = array[0].length;        
			    if(m==0) return result;        
			    int layers = (Math.min(n,m)-1)/2+1;//这个是层数        层数是以最短边的对角线为基准的，比如（0，0）,(1,1)...，只取一半。
			                                      //               之所以-1和+1当对角线元素个数为基数时候，会出现个0.5层，需要进为1
			    for(int i=0;i<layers;i++){            
			    	for(int k = i;k<m-i;k++) result.add(array[i][k]);//左至右           
			    	for(int j=i+1;j<n-i;j++) result.add(array[j][m-i-1]);//右上至右下            
			    	for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--) result.add(array[n-i-1][k]);//右至左            
			    	for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) result.add(array[j][i]);//左下至左上       
			    	}      
			    return result; 
			    }
	    }


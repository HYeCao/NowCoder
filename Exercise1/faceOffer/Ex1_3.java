/**
 * 
 */
package faceOffer;

/**
 * @author dell
 *二维数组中的查找
 *左下角开始进行查找
 */
public class Ex1_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int[][] array = {{1,4,8},
			          {2,5,9},
	                  {3,6,10}};
	 System.out.println(search(array, 12));
	 
	 }
	public static boolean search(int[][] array,int x){
		int a=array.length-1;
		int b=0;
		while(a>=0&&b<array[0].length){
			if(array[a][b]==x){
				return true;
			}
			if(array[a][b]>x){
				a--;
			}
			if(array[a][b]<x){
				b++;
			}
			
		}
		return false;
	}
	}



/**
 * 
 */
package huaWei;

import java.util.Scanner;

/**
 * 输入多行数字，第一行数字代表接下来要输入的数字个数。
 * 每个数字的值代表其可以向后跳跃的最长长度，求从第一位跳到最后一位的最短步数。
 * @author dell
 *
 */
public class Ex1_2_ShortPath_HuiSu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner=new Scanner(System.in);
//		int path=scanner.nextInt();\
		int path=7;
		int[] root={2,3,2,1,2,1,5};
//		for(int i=0;i<path;i++){
//			root[i]=scanner.nextInt();
//		}

		System.out.println(ShortPath(root, path,0));
	}
	public static int ShortPath(int[] root,int path,int i){
		if(path==1)return 0;
		int bushu=0;
//		System.out.println(root[i]);
		for(int x=1;x<root[i]+1;x++){
			bushu=ShortPath(root, path-x, i+x)+1;
		}
		return bushu;
		
	}

}

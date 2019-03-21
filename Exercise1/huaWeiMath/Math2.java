/**
 * 
 */
package huaWeiMath;

import java.util.Scanner;

/**
 * @author dell
 *
 */
public class Math2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNextLine()){
			int num=Integer.valueOf(scanner.nextLine());//矩阵N*N	
			String[] matrix=new String[num];
			if(num==0){
				System.out.println(0);
				break;
			}
			for(int i=0;i<num;i++){
			matrix[i]=scanner.nextLine();
			}
			System.out.println(Integer.valueOf(QiuMianJi(matrix)));//num行矩阵的字符串形式
		}
		
	}
   public static String QiuMianJi(String[] matrix){
	   int lie=matrix[0].split("").length;
	   if(lie==1)return "1";
//	   System.out.println(lie);
	   int[][] mat=new int[matrix[0].length()][lie];
	   for(int i=0;i<matrix.length;i++){
		   for(int j=0;j<lie;j++){
			   String[]  li=matrix[i].split("");
			   mat[i][j]=Integer.valueOf(li[j]);//构建出int类型的矩阵
			   
		   }
	   }
	   int Len = 0;
       int m=matrix.length;
      
		for (int i = 1; i < m; i++) {

			for (int j = 1; j < lie; j++) {

				if (mat[i][j] == 1) {
                                            //对以arr[i][j]为定点的右上最小正方形矩阵其他三个顶点取最小值

					int temp = min(mat[i][j - 1], mat[i - 1][j], mat[i - 1][j - 1]);

					if (temp != 0) {//最小值为0，则不能作为所求目标的边

						mat[i][j] = temp + 1;//将最小值+1赋值给右上顶点，以便向上运算

						if (mat[i][j] > Len)//如果，右上顶点值>边长，则更新边长

							Len = mat[i][j];

					}

				}

			}

		}
		return String.valueOf(Len * Len);
		

}

   //计算三个整数最小值

static int min(int a, int b, int c) {
	a = a < b ? a : b;
	a = a < c ? a : c;
	return a;

}

}

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
			int num=Integer.valueOf(scanner.nextLine());//����N*N	
			String[] matrix=new String[num];
			if(num==0){
				System.out.println(0);
				break;
			}
			for(int i=0;i<num;i++){
			matrix[i]=scanner.nextLine();
			}
			System.out.println(Integer.valueOf(QiuMianJi(matrix)));//num�о�����ַ�����ʽ
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
			   mat[i][j]=Integer.valueOf(li[j]);//������int���͵ľ���
			   
		   }
	   }
	   int Len = 0;
       int m=matrix.length;
      
		for (int i = 1; i < m; i++) {

			for (int j = 1; j < lie; j++) {

				if (mat[i][j] == 1) {
                                            //����arr[i][j]Ϊ�����������С�����ξ���������������ȡ��Сֵ

					int temp = min(mat[i][j - 1], mat[i - 1][j], mat[i - 1][j - 1]);

					if (temp != 0) {//��СֵΪ0��������Ϊ����Ŀ��ı�

						mat[i][j] = temp + 1;//����Сֵ+1��ֵ�����϶��㣬�Ա���������

						if (mat[i][j] > Len)//��������϶���ֵ>�߳�������±߳�

							Len = mat[i][j];

					}

				}

			}

		}
		return String.valueOf(Len * Len);
		

}

   //��������������Сֵ

static int min(int a, int b, int c) {
	a = a < b ? a : b;
	a = a < c ? a : c;
	return a;

}

}

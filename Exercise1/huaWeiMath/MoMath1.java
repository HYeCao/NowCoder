package huaWeiMath;



import java.io.File;

import java.io.FileWriter;

import java.io.Writer;

import java.util.Scanner;

public class MoMath1 {

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(new File("matrix.in"));

			Writer wr = new FileWriter("martrix.out");

                        //声明二维数组存放(0,1)矩阵

			int m = sc.nextInt();

			int n = sc.nextInt();

			int[][] arr = new int[m][n];

                        //两次循环为数组初始化

			for (int i = 0; i < m; i++) {

				for (int j = 0; j < n; j++) {

					arr[i][j] = sc.nextInt();

				}

			}

                        //变量borderSideLength存放最大边长

			int borderSideLength = 0;

			for (int i = 1; i < m; i++) {

				for (int j = 1; j < n; j++) {

					if (arr[i][j] == 1) {

                                                 //对以arr[i][j]为定点的右上最小正方形矩阵其他三个顶点取最小值

						int temp = min(arr[i][j - 1], arr[i - 1][j], arr[i - 1][j - 1]);

						if (temp != 0) {//最小值为0，则不能作为所求目标的边

							arr[i][j] = temp + 1;//将最小值+1赋值给右上顶点，以便向上运算

							if (arr[i][j] > borderSideLength)//如果，右上顶点值>边长，则更新边长

								borderSideLength = arr[i][j];

						}

					}

				}

			}

			wr.write(String.valueOf(borderSideLength * borderSideLength));

			sc.close();

			wr.close();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

		}

	}

        //计算三个整数最小值

	static int min(int a, int b, int c) {

		a = a < b ? a : b;

		a = a < c ? a : c;

		return a;

	}

}

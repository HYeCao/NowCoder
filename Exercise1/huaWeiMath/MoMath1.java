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

                        //������ά������(0,1)����

			int m = sc.nextInt();

			int n = sc.nextInt();

			int[][] arr = new int[m][n];

                        //����ѭ��Ϊ�����ʼ��

			for (int i = 0; i < m; i++) {

				for (int j = 0; j < n; j++) {

					arr[i][j] = sc.nextInt();

				}

			}

                        //����borderSideLength������߳�

			int borderSideLength = 0;

			for (int i = 1; i < m; i++) {

				for (int j = 1; j < n; j++) {

					if (arr[i][j] == 1) {

                                                 //����arr[i][j]Ϊ�����������С�����ξ���������������ȡ��Сֵ

						int temp = min(arr[i][j - 1], arr[i - 1][j], arr[i - 1][j - 1]);

						if (temp != 0) {//��СֵΪ0��������Ϊ����Ŀ��ı�

							arr[i][j] = temp + 1;//����Сֵ+1��ֵ�����϶��㣬�Ա���������

							if (arr[i][j] > borderSideLength)//��������϶���ֵ>�߳�������±߳�

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

        //��������������Сֵ

	static int min(int a, int b, int c) {

		a = a < b ? a : b;

		a = a < c ? a : c;

		return a;

	}

}

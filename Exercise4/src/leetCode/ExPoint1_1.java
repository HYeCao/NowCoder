/**
 * 
 */
package leetCode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ����2Dƽ���ϵ�n���㣬�ҵ�λ��ͬһֱ���ϵ���������
 * 
 * @author dell
 *
 */
class Point {
	int x;
	int y;

	Point() {
		x = 0;
		y = 0;
	}

	Point(int a, int b) {
		x = a;
		y = b;
	}
}

public class ExPoint1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1=new Point(0,0);
		Point point2=new Point(1,0);
		Point[] points={point1,point2};
		maxPoints(points);
	}

	/*
	 * ˼�룺ѭ��+�ݹ�
	 */
	public static int maxPoints(Point[] points) {
		if (points.length == 1) {
			return 1;
		}
		int k = 0;// б��
		int num = 0;// ͬһ�����ϵĵ������
		int temp = 0;// �������������ڴ洢�����
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < points.length; i++) {// ��ʼ���
			for (int j = i + 1; j < points.length; j++) {// �ڶ����
				
		}
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
		return list.get(list.size()-1);
	}

	public static int Ksum(Point[] points, int i, int j, int k, int sum) {
		if (j >= points.length) {
			return sum;
		} else {
			if ((points[j].y - points[i].y) / (points[j].x - points[i].x) == k) {// �ҵ�б����ͬ�ĵ�
				sum++;
				Ksum(points, i, j + 1, k, sum);
			} else {
				Ksum(points, i, j + 1, k, sum);
			}
			return 0;
		}
	}

}

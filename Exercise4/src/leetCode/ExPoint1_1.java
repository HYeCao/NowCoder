/**
 * 
 */
package leetCode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 给定2D平面上的n个点，找到位于同一直线上的最大点数。
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
	 * 思想：循环+递归
	 */
	public static int maxPoints(Point[] points) {
		if (points.length == 1) {
			return 1;
		}
		int k = 0;// 斜率
		int num = 0;// 同一条线上的点的总数
		int temp = 0;// 辅助变量，用于存储结点数
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < points.length; i++) {// 初始结点
			for (int j = i + 1; j < points.length; j++) {// 第二结点
				
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
			if ((points[j].y - points[i].y) / (points[j].x - points[i].x) == k) {// 找到斜率相同的点
				sum++;
				Ksum(points, i, j + 1, k, sum);
			} else {
				Ksum(points, i, j + 1, k, sum);
			}
			return 0;
		}
	}

}

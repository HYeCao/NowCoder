/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

/**
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ��� ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"��
 * ���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
 * 
 * @author dell
 *
 */
public class ExString_stream_2_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Insert('h');
		Insert('e');
		Insert('l');
		Insert('l');
		Insert('o');
		Insert('\n');
		System.out.println('\n');
	}

	static char c;
	static ArrayList<Character> list = new ArrayList<Character>();

	public static void Insert(char ch) {
		c = ch;
		
	}

	// return the first appearence once char in current stringstream
	public static char FirstAppearingOnce() {
		// ArrayList<Character> list=new ArrayList<Character>();
		if (list.contains(c)) {// ��ǰ�����Ԫ���ظ�
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == c) {// �ҵ��ظ���Ԫ��
					list.remove(i);// �Ƴ���ǰ�ظ���Ԫ��
				}

			}
			if (list.size() == 0)
				return '#';
			else
				return list.get(0);
		} else {// ��ǰԪ�ص�һ�γ���
			list.add(c);
			return list.get(0);
		}
	}
	/*
	 * int count[]=new int[256]; //Insert one char from stringstream int
	 * index=1; 
	 * public void Insert(char ch) { 
	 * if(count[ch]==0){
	 * count[ch]=index++; 
	 * } 
	 * else{ 
	 * count[ch]=-1; 
	 * } 
	 * } //return the first
	 * appearence once char in current stringstream public char
	 * FirstAppearingOnce() { 
	 * int temp=Integer.MAX_VALUE; 
	 * char ch='#'; 
	 * for(int i=0;i<256;i++){ 
	 * if(count[i]!=0&&count[i]!=-1&&count[i]<temp){
	 * temp=count[i]; 
	 * ch=(char)i; 
	 * } 
	 * } 
	 * return ch; 
	 * }
	 */
}

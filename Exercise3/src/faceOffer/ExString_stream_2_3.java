/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
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
		if (list.contains(c)) {// 当前加入的元素重复
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == c) {// 找到重复的元素
					list.remove(i);// 移除当前重复的元素
				}

			}
			if (list.size() == 0)
				return '#';
			else
				return list.get(0);
		} else {// 当前元素第一次出现
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

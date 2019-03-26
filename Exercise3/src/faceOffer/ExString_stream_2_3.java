/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 *       当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * @author dell
 *
 */
public class ExString_stream_2_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="google";
		ArrayList<Character> list=new ArrayList<Character>(); 
		list.add('g');
		list.add('o');
		list.add('o');
		list.add('g');
		if(list.contains('g')){
			list.remove('o');
			
		}
		System.out.println(list);
	}
	StringBuilder  sb=new StringBuilder();
	 public void Insert(char ch){
	    sb.append(ch);
	    System.out.println( FirstAppearingOnce());   
	    }
	  //return the first appearence once char in current stringstream
	 /**
	  *  思路：1.使用队列进行实现
	  *        2.使用双循环进行实现 
	  * @return
	  */
	 public char FirstAppearingOnce(){
		 char ch=0;
		ArrayList<Character> list=new ArrayList<Character>();
		Deque<Character> deque=new LinkedList<Character>();//利用队列的先进先出的特性来实现，作为辅助数组，来对第一个出现的值进行保存，并判断
		String str=sb.toString();
		
		
	    return '#';
	    }
}

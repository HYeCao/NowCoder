/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
 * ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"��
 *       ���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
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
	  *  ˼·��1.ʹ�ö��н���ʵ��
	  *        2.ʹ��˫ѭ������ʵ�� 
	  * @return
	  */
	 public char FirstAppearingOnce(){
		 char ch=0;
		ArrayList<Character> list=new ArrayList<Character>();
		Deque<Character> deque=new LinkedList<Character>();//���ö��е��Ƚ��ȳ���������ʵ�֣���Ϊ�������飬���Ե�һ�����ֵ�ֵ���б��棬���ж�
		String str=sb.toString();
		
		
	    return '#';
	    }
}

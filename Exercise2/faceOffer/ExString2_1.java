package faceOffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�
 * ����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��
 * @author dell
 *
 */
public class ExString2_1 {
	public static void main(String[] args) {
		String str="googgle";
		System.out.println(FirstNotRepeatingChar(str));
	}
	public static  int FirstNotRepeatingChar(String str) {
		if(str.length()==0)return -1;
		/*
		 * ����˼�룺ʹ�ö��еķ�ʽ���н������������е�Ԫ���ظ��������ɾ�������pop����һ�����벢��û��ɾ����Ԫ��
		 */
		Deque<Character> list=new ArrayDeque<Character>();
		Deque<Character> list2=new ArrayDeque<Character>();//���Ӧ�䣬˫���н���ʵ�֣�������
		for(int i=0;i<str.length();i++){
			if(list.contains(str.charAt(i))){
				list.remove(str.charAt(i));
				list2.add(str.charAt(i));
			}
			else {
				if(!list2.contains(str.charAt(i)))
				list.add(str.charAt(i));
			}
		}
		if(list.size()==0)return -1;
		else {
			char s=list.pop();
			int i=0;
			for(;i<str.length();i++){
				if(s==str.charAt(i))break;
			}
			return i;
		}
    }
}

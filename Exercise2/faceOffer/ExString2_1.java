package faceOffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）
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
		 * 解题思想：使用队列的方式进行解决，如果队列中的元素重复，则进行删除，最后pop出第一个加入并且没有删除的元素
		 */
		Deque<Character> list=new ArrayDeque<Character>();
		Deque<Character> list2=new ArrayDeque<Character>();//灵活应变，双队列进行实现，哈哈哈
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

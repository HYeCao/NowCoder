/**
 * 
 */
package leetCode;

import java.util.ArrayList;
import java.util.Set;

/**
 * 给定字符串s和单词字典dict，确定s是否可以被分割成一个或多个字典单词的空格分隔序列。
 * 例如，给定
 * s =“leetcode”，
 * dict = [“leet”，“code”]。
 * 返回true，因为“leetcode”可以被分段为“leet code”。
 * @author dell
 *
 */
public class ExDyPl2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static boolean wordBreak(String s, Set<String> dict) {
		   ArrayList<String> list=new ArrayList<String>();
	       if(s.length()==0)return false;
	       String fin=new String();
//	       System.out.println(Work(s, dict, list, 0, fin));
		 return Work(s, dict, list, 0, fin);
	    }
	 public static boolean Work(String s,Set<String> dict,ArrayList<String> list,int num,String fin){
	
		 return false;
	 }
}

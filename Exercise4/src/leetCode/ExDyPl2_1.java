/**
 * 
 */
package leetCode;

import java.util.ArrayList;
import java.util.Set;

/**
 * �����ַ���s�͵����ֵ�dict��ȷ��s�Ƿ���Ա��ָ��һ�������ֵ䵥�ʵĿո�ָ����С�
 * ���磬����
 * s =��leetcode����
 * dict = [��leet������code��]��
 * ����true����Ϊ��leetcode�����Ա��ֶ�Ϊ��leet code����
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

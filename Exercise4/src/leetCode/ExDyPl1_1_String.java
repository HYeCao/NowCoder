/**
 * 
 */
package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定字符串s和单词字典dict，在s中添加空格以构造一个句子，其中每个单词都是有效的字典单词。
 * 返回所有这些可能的句子。
 * 例如，给定 
 * s =“catsanddog”，
 * dict = [“cat”，“cats”，“and”，“sand”，“dog”]
 * 解决方案是[“cats and dog ”，“cat sand dog”]
 * @author dell
 *
 */
public class ExDyPl1_1_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="pine";
		String b="apple";String c="pineapple";String d="applepen";String e="pen";
		List<String> dict = new ArrayList<>();
		dict.add(a);dict.add(b);dict.add(c);dict.add(d);dict.add(e);
		String ss="pineapplepenapple";
		wordBreak(ss, dict);
	}
	/**
	 * 动态规划思想：进行递归实现
	 * @param s
	 * @param dict
	 * @return
	 */
	 public static List<String> wordBreak(String s, List<String> wordDict) {
		 ArrayList<String> list=new ArrayList<String>();
	       if(s.length()==0)return list;
	       String fin=new String();
	       Work(s, wordDict, list, 0, fin);
	       System.out.println(list);
		   return list;
	    }
  
   /**
    * 运行的时间复杂度过高，需要进行处理优化
    * @param s
    * @param dict
    * @param list
    * @param num
    * @param fin
    */
   public static void Work(String s,List<String> dict,ArrayList<String> list,int num,String fin){
	   if(num>=s.length()){
		   list.add(fin);//空格加完之后，添加至list之中
		   return ;
	   }
	   else{
		   StringBuilder sb =new StringBuilder();
		   for(int i=num;i<s.length();i++){
			   sb.append(s.charAt(i));//设定字符  
			   if(dict.contains(sb.toString())){//当匹配出一个字符时
				   if(fin.length()==0||sb.toString().contains(fin)){
					   //此处存在得问题，当第二个单词是重复使用时会导致显示的错误
					   fin=sb.toString();
				   }
				   else{fin=fin+" "+sb.toString();}
				   System.out.println(fin+"            "+sb.toString());
				   Work(s, dict, list, i+1, fin);
				   
			   }
		   }
		   
	   }
   }
}
/*
 *从后往前进行添加 
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Solution {
    public ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> wordBreak(String s, Set<String> dict) {
        dfs(s, s.length(), "", dict);
        return list;
    }
 
    private void dfs(String s, int index, String str, Set<String> dict) {
        if (index <= 0) {
            if (str.length() > 0) {
                list.add(str.substring(0, str.length() - 1));
            }
        }
        for (int i = index; i >= 0; i--) {
            if (dict.contains(s.substring(i, index))) {
                dfs(s, i, s.substring(i, index) + " " + str, dict);
            }
        }
    }
}*/

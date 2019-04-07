/**
 * 
 */
package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * �����ַ���s�͵����ֵ�dict����s����ӿո��Թ���һ�����ӣ�����ÿ�����ʶ�����Ч���ֵ䵥�ʡ�
 * ����������Щ���ܵľ��ӡ�
 * ���磬���� 
 * s =��catsanddog����
 * dict = [��cat������cats������and������sand������dog��]
 * ���������[��cats and dog ������cat sand dog��]
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
	 * ��̬�滮˼�룺���еݹ�ʵ��
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
    * ���е�ʱ�临�Ӷȹ��ߣ���Ҫ���д����Ż�
    * @param s
    * @param dict
    * @param list
    * @param num
    * @param fin
    */
   public static void Work(String s,List<String> dict,ArrayList<String> list,int num,String fin){
	   if(num>=s.length()){
		   list.add(fin);//�ո����֮�������list֮��
		   return ;
	   }
	   else{
		   StringBuilder sb =new StringBuilder();
		   for(int i=num;i<s.length();i++){
			   sb.append(s.charAt(i));//�趨�ַ�  
			   if(dict.contains(sb.toString())){//��ƥ���һ���ַ�ʱ
				   if(fin.length()==0||sb.toString().contains(fin)){
					   //�˴����ڵ����⣬���ڶ����������ظ�ʹ��ʱ�ᵼ����ʾ�Ĵ���
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
 *�Ӻ���ǰ������� 
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

/**
 * 
 */
package huaWeiOffer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author dell
 *
 */
/*
 * 1.增强for循环
for(String str : list) {//其内部实质上还是调用了迭代器遍历方式，这种循环方式还有其他限制，不建议使用。
    System.out.println(str);
}
2.普通for循环
for( int i = 0 ; i < list.size() ; i++) {//内部不锁定，效率最高，但在多线程要考虑并发操作的问题。
    System.out.println(list.get(i));
}
3.迭代器遍历
Iterator<String> iter = list.iterator();
while(iter.hasNext()){  //执行过程中会执行数据锁定，性能稍差，若在循环过程中要去掉某个元素只能调用iter.remove()方法。
    System.out.println(iter.next());
}
 */
/*
 * 字符串截取
 * 一：String.substring(int start)
 * 参数： start：要截取位置的索引
 * 二：String.substring(int beginIndex, int endIndex)
 * 参数：beginIndex 开始位置索引
 * 索引的获取：
 *       endIndex    结束位置索引
 *       int begin=useName.indexOf（“.”）;
 *       int last=useName.length();
 */
class Snode implements Comparable<Snode>{
	String filename;
	int lineNo;
	int times;
	public Snode(String filename, int lineNo, int times) {
		this.filename = filename;
		this.lineNo = lineNo;
		this.times = times;
		
	}
	
	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}
	@Override
	public int compareTo(Snode user) {           //重写Comparable接口的compareTo方法，
		return user.getTimes()-this.times;// 根据年龄升序排列，降序修改相减顺序即可
}
}
public class Ex4_1_String_list {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		List<String> list=new ArrayList<String>();
		int i=0;
		while(scanner.hasNext()){//ctrl+z 结束
			/*
			 * 输入的信息首先需要明确清楚，往往会有多个要求，因此需要进行详尽的处理
			 */
			String end=scanner.nextLine();
//			if(end.equals(""))break;
			String str=scanner.next();
			str +=scanner.nextInt();
			list.add(str);
		}
		List<Snode> lists=new ArrayList<Snode>();
		lists=FileRecord(list);
		for(i=0;i<lists.size();i++)
		{
			System.out.println(lists.get(i).filename+" "+lists.get(i).lineNo+" "+lists.get(i).times);
		}
	}
	public static List<Snode> FileRecord(List<String> input){
//		List<String> list=new ArrayList<String>();
		String str;
		String[] str1=new String[2];
		
		StringBuilder sb=new StringBuilder();
		String root;
		String filename;
		int line=0;
		int num=0;
		List<Snode> lists=new ArrayList<Snode>();
		for(int i=0;i<input.size();i++){
			str=input.get(i);
			str1=str.split(" ");
			root=str1[0];//获取路径
			line=Integer.valueOf(str1[1]);//获取行号
			String[] str2=new String[root.split("/").length];
			str2=root.split("/");
			filename=str2[str2.length-1];//获取文件名

			Snode newnode=new Snode(filename,line,1);//创建新节点
			lists.add(newnode);//将节点添加到lists之中
		}
		/*
		 * 对创建出的结点数组进行处理
		 */

		 for (int i = 0; i < lists.size() - 1; i++) {
	            for (int j = lists.size() - 1; j > i; j--) {
	                if (lists.get(j).filename.equals(lists.get(i).filename)&&lists.get(j).lineNo==lists.get(i).lineNo) {
	                	lists.get(i).times++;
	                    lists.remove(j);
	                }
	            }
		 }
		 Collections.sort(lists);
		return lists;
	}

}

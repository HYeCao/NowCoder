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
 * 1.��ǿforѭ��
for(String str : list) {//���ڲ�ʵ���ϻ��ǵ����˵�����������ʽ������ѭ����ʽ�����������ƣ�������ʹ�á�
    System.out.println(str);
}
2.��ͨforѭ��
for( int i = 0 ; i < list.size() ; i++) {//�ڲ���������Ч����ߣ����ڶ��߳�Ҫ���ǲ������������⡣
    System.out.println(list.get(i));
}
3.����������
Iterator<String> iter = list.iterator();
while(iter.hasNext()){  //ִ�й����л�ִ�����������������Բ����ѭ��������Ҫȥ��ĳ��Ԫ��ֻ�ܵ���iter.remove()������
    System.out.println(iter.next());
}
 */
/*
 * �ַ�����ȡ
 * һ��String.substring(int start)
 * ������ start��Ҫ��ȡλ�õ�����
 * ����String.substring(int beginIndex, int endIndex)
 * ������beginIndex ��ʼλ������
 * �����Ļ�ȡ��
 *       endIndex    ����λ������
 *       int begin=useName.indexOf����.����;
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
	public int compareTo(Snode user) {           //��дComparable�ӿڵ�compareTo������
		return user.getTimes()-this.times;// ���������������У������޸����˳�򼴿�
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
		while(scanner.hasNext()){//ctrl+z ����
			/*
			 * �������Ϣ������Ҫ��ȷ������������ж��Ҫ�������Ҫ�����꾡�Ĵ���
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
			root=str1[0];//��ȡ·��
			line=Integer.valueOf(str1[1]);//��ȡ�к�
			String[] str2=new String[root.split("/").length];
			str2=root.split("/");
			filename=str2[str2.length-1];//��ȡ�ļ���

			Snode newnode=new Snode(filename,line,1);//�����½ڵ�
			lists.add(newnode);//���ڵ���ӵ�lists֮��
		}
		/*
		 * �Դ������Ľ��������д���
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

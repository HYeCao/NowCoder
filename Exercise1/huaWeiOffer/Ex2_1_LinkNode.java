/**
 * 
 */
package huaWeiOffer;

import java.util.Scanner;

/**
 * @author dell
 *
 */
class node{
	int val ;
	node next;
	public node(int val, node next) {
		this.val = val;
		this.next = next;
	}
	
}
public class Ex2_1_LinkNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		/*
		 * ѭ���������������ʵ��
		 */
		while(scanner.hasNext()){
		int num=scanner.nextInt();
		int endNum=DeleteNum(num);
		System.out.println(endNum);
		}
	}
	public static int DeleteNum(int num){
		node head=new node(0,null);
		node next=new node(1,null);
		head.next=next;
		for(int i=2;i<num;i++){
			node newnode=new node(i,null);
		    next.next=newnode;
			next=newnode;
		}
		next.next=head;
		int x=2,y=1;
		node pnode=head;
		while(true){
			node newnode=pnode.next.next;//Ҫɾ���Ľ��
			pnode=pnode.next;//ɾ��������һ�����
			newnode=newnode.next;//ɾ��������һ�����
			pnode.next=newnode;//��һ���������һ���������
			y++;
			pnode=newnode;//��һ�����
//			System.out.println(pnode.val);
			if(y>=num)break;
		}
//		System.out.println(pnode.next.val);
		
		
		
		return pnode.val;
	}
}

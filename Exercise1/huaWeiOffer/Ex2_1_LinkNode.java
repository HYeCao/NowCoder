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
		 * 循环输入测试用例的实现
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
			node newnode=pnode.next.next;//要删除的结点
			pnode=pnode.next;//删除结点的上一个结点
			newnode=newnode.next;//删除结点的下一个结点
			pnode.next=newnode;//上一个结点与下一个结点连接
			y++;
			pnode=newnode;//下一个结点
//			System.out.println(pnode.val);
			if(y>=num)break;
		}
//		System.out.println(pnode.next.val);
		
		
		
		return pnode.val;
	}
}

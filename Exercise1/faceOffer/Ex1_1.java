/**
 * 
 */
package faceOffer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javafx.scene.effect.Lighting;

/**
 * @author dell
 * ����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList
 */
public class Ex1_1 {

	static ArrayList<Integer> List=new ArrayList<Integer>();
	public static void GetList(ListNode ListNode){
		while(ListNode.next!=null){
			List.add(ListNode.val);
			ListNode=ListNode.next;
		}
		//ʵ������ķ�ת
//		Collections.reverse(List);
		System.out.println(List);
	}
	public static void main(String[] args) throws IOException{
		ListNode node1=new ListNode(3);
		ListNode node2=new ListNode(5);
		ListNode node3=new ListNode(7);
		ListNode node4=new ListNode(9);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		GetList(node1);
	}
}
/**
 * 
 * ����Ķ���
 */
class ListNode{
	int val;
	ListNode next=null;
	ListNode (int val){
		this.val=val;
	}

}

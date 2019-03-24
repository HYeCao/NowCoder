/**
 * 
 */
package faceOffer;

import java.util.Stack;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 * @author dell
 *
 */
public class ExLinkedList3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		System.out.println(FindFirstCommonNode(node1, node2).val);
	}
	/**
	 * 
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */
//	public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
//		ListNode end=new ListNode(0);
//		while(pHead1!=null&&pHead2!=null){
//			if(pHead1.val!=pHead2.val){
//				
//				end=pHead1;
//			}
//			pHead1=pHead1.next;
//			pHead2=pHead2.next;
//		}
//		return end;
//	}
	/**
	 * 求公共子序列的方式，从后往前进行，但是时间复杂度太高
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */
	
	  public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if(pHead1==null&&pHead2==null){
			return null;
		}
		if(pHead1!=null&&pHead2==null)return null;
		if(pHead1==null&&pHead2!=null)return pHead2;
//		System.out.println("est1");
		 Stack<ListNode> st1=new Stack<ListNode>();
		Stack<ListNode> st2=new Stack<ListNode>();
		st1.add(pHead1);
		st2.add(pHead2);
		while(pHead1.next!=null||pHead2.next!=null){
			if(pHead1.next!=null){
			pHead1=pHead1.next;
			st1.push(pHead1);
			}
			if(pHead2.next!=null){
				pHead2=pHead2.next;
				st2.push(pHead2);
			}
		}
		int size=st1.size()+1;
		if(st2.size()>=size)size=st2.size()+1;
//		System.out.println(st1.pop().val+" "+st2.pop().val);
		for(int i=0;i<size;i++){
			if(st1.peek().val==st2.peek().val){
				ListNode no1=st1.pop();st2.pop();
				if(st1.isEmpty()||st2.isEmpty()){
					return no1;
				}
				if(st1.peek().val!=st2.peek().val){
					return no1;
				}
			}
		}
		return null;
	 }
	
}

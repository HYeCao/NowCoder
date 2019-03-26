/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * @author dell
 *
 */
public class ExLinkedList1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 思路：1.双重循环进行实现判别
	 * 2.分开进行，先对于数值进行判别，其次对于结点再进行操作
	 * ANSWER：使用递归进行实现//使用结点判断进行实现
	 * @param pHead
	 * @return
	 */
	public ListNode deleteDuplication(ListNode pHead)
    {	
			ListNode first = new ListNode(-1);//设置一个trick         
			first.next = pHead;         
			ListNode p = pHead;        
			ListNode last = first;        
			while (p != null && p.next != null) {            
				if (p.val == p.next.val) {                
					int val = p.val;                
					while (p!= null&&p.val == val)                    
						p = p.next;                
					last.next = p;            
					} else {                
						last = p;                
						p = p.next;            
						}        
				}        
			return first.next;
    }
}

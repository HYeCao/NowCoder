/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

/**
 * ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣 
 * ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
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
	 * ˼·��1.˫��ѭ������ʵ���б�
	 * 2.�ֿ����У��ȶ�����ֵ�����б���ζ��ڽ���ٽ��в���
	 * ANSWER��ʹ�õݹ����ʵ��//ʹ�ý���жϽ���ʵ��
	 * @param pHead
	 * @return
	 */
	public ListNode deleteDuplication(ListNode pHead)
    {	
			ListNode first = new ListNode(-1);//����һ��trick         
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

/**
 * 
 */
package leetCode;

import java.util.ArrayList;

/**
 * ������������ѭ����ʼ�Ľڵ㡣 ���û��ѭ�����򷵻�null��
 * ���������ܲ��ö���Ŀռ�������
 * @author dell
 *
 */
public class ExLinkedList2_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 1��ͬlinked-list-cycle-iһ�⣬ʹ�ÿ���ָ�뷽�����ж��Ƿ���ڻ�������¼��ָ������λ��(Z)�� 
	 * 2������ָ��ֱ��������ͷ(X)������λ��(Z)������Ϊ��ͬ�ٶ��ƽ�������ָ���ڻ���ʼλ������(Y)
	 * @param head
	 * @return
	 */
   public ListNode detectCycle(ListNode head) {
        ArrayList<ListNode> list=new ArrayList<ListNode>();
        ListNode node=head;
        while(node!=null){
        	if(!list.contains(node)){
        		list.add(node);
        	}
        	else {
        		return node;
        	}
        	node=node.next;
        }
	   return null;
    }
   /*  ����ָ���߷���ʵ�ִ���
   public ListNode detectCycle(ListNode head) {
	      ListNode slow=head;
	      ListNode fast=head;
	         
	      while(fast!=null&&fast.next!=null){
	          fast=fast.next.next;
	          slow=slow.next;
	           
	          if(fast==slow){
	             ListNode slow2=head;
	              while(slow2!=slow){
	               slow=slow.next;
	                slow2=slow2.next;  
	              }
	              return slow;
	          }
	      }
	         return null; 
	    }
	    */
}

/**
 * 
 */
package leetCode;

import java.util.ArrayList;

/**
 * 给定链表，返回循环开始的节点。 如果没有循环，则返回null。
 * 跟进：你能不用额外的空间解决它吗？
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
	 * 1）同linked-list-cycle-i一题，使用快慢指针方法，判定是否存在环，并记录两指针相遇位置(Z)； 
	 * 2）将两指针分别放在链表头(X)和相遇位置(Z)，并改为相同速度推进，则两指针在环开始位置相遇(Y)
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
   /*  快慢指针走法得实现代码
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

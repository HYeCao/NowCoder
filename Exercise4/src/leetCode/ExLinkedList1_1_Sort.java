/**
 * 
 */
package leetCode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 * 链表进行排序，时间复杂度要求O(n log n),利用快速排序进行实现
 * @author dell
 *
 */
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	 }
public class ExLinkedList1_1_Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static  ListNode sortList(ListNode head) {
	     ArrayList<ListNode> list=new ArrayList<ListNode>();
	     while(head!=null){
	    	 list.add(head);
	    	 head=head.next;
	     }
		 return list.get(0);
	    }
}

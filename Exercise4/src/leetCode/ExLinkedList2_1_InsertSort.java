/**
 * 
 */
package leetCode;

/**
 * Sort a linked list using insertion sort.
 * @author dell
 *
 */
public class ExLinkedList2_1_InsertSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 插入排序进行实现
	 * @param head
	 * @return
	 */
	 public ListNode insertionSortList(ListNode head) {
	     ListNode node=head;
	     while(node!=null){//选择每次插入的结点
	    	 ListNode temp=node;
	    	 while(temp!=null){//进行插入的判断位置选择
	    		 if(temp.val<node.val){//当后一个结点小于前一个节点时
	    			 int val=temp.val;
	    			 temp.val=node.val;
	    			 node.val=val;
	    		 }
	    		 temp=temp.next;
	    	 }
	    	 node=node.next;
	     }
		 return head;
	    }
}

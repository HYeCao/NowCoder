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
	 * �����������ʵ��
	 * @param head
	 * @return
	 */
	 public ListNode insertionSortList(ListNode head) {
	     ListNode node=head;
	     while(node!=null){//ѡ��ÿ�β���Ľ��
	    	 ListNode temp=node;
	    	 while(temp!=null){//���в�����ж�λ��ѡ��
	    		 if(temp.val<node.val){//����һ�����С��ǰһ���ڵ�ʱ
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

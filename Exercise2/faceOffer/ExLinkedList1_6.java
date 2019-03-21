/**
 * 
 */
package faceOffer;

/**
 * @author dell
 *
 */
public class ExLinkedList1_6 {

	/**
	 * 输入两个单调递增的链表，输出两个链表合成后的链表
	 * 当然我们需要合成后的链表满足单调不减规则。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(5);
		ListNode node4 = new ListNode(7);
		ListNode node5 = new ListNode(9);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		ListNode lis1=new ListNode(2);
		ListNode lis2=new ListNode(4);
		ListNode lis3=new ListNode(6);
		ListNode lis4=new ListNode(8);
		ListNode lis5=new ListNode(10);
		lis1.next=lis2;
		lis2.next=lis3;
		lis3.next=lis4;
		lis4.next=lis5;
		ListNode newnode=Merge(node1, lis1);
		while(newnode!=null){
			System.out.println(newnode.val);
			newnode=newnode.next;
		}
//		System.out.println(newnode.next.val);
	}
	/**
	 * 
	 * @param list1
	 * @param list2
	 * @return
	 */
	  public static ListNode Merge(ListNode list1,ListNode list2) {
		  ListNode newnode=null;
		  if(list1==null)return list2;
		  else if(list2==null)return list1;
		  else if(list1.val<list2.val){
			  newnode=list1;
			  list1=list1.next;
		  }
		  else {
			  newnode=list2;
			  list2=list2.next;
		  }
		  ListNode end=newnode;
		  while(list1!=null||list2!=null){
			  if(list1==null){
				  newnode.next=list2;
				  break;
			  }
			  else if(list2==null){
				  newnode.next=list1;
				  break;
			  }
			  else if(list1.val<list2.val){
				  newnode.next=list1;
				  newnode=list1;
				  list1=list1.next;
			  }
			  else {
				  newnode.next=list2;
				  newnode=list2;
				  list2=list2.next;
			  }
		  }
	        return end;
	    }
}

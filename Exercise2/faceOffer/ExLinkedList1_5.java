/**
 * 
 */
package faceOffer;

/**
 * @author dell
 *
 */
public class ExLinkedList1_5 {

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
		// System.out.println(node1.val);
		// System.out.println(node1.next.val);
		ReverseList(node1);
		System.out.println(node1.val);

	}

	// 参考代码：
	// if(head==null)
	// return null;
	// ListNode newHead = null;
	// ListNode pNode = head;
	// ListNode pPrev = null;
	// while(pNode!=null){
	// ListNode pNext = pNode.next;
	// if(pNext==null)
	// newHead = pNode;
	// pNode.next = pPrev;
	// pPrev = pNode;
	// pNode = pNext;
	// }
	// return newHead;
	public static ListNode ReverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode newHead = null;
		ListNode pNode = head;
		ListNode pPrev = null;
		while (pNode != null) {
			ListNode pNext = pNode.next;
			if (pNext == null)
				newHead = pNode;
			pNode.next = pPrev;//借助一个空结点来反转
			pPrev = pNode;
			pNode = pNext;//当前节点与下一节点都先单独处理，然后再链接
		}
		System.out.println(newHead.val);
		return newHead;
	}
}

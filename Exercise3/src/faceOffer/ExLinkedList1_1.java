/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * @author dell
 *
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class ExLinkedList1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 
	 * @param pHead
	 * @return
	 */
	public ListNode EntryNodeOfLoop(ListNode pHead)
    {
		ArrayList<ListNode> list=new ArrayList<ListNode>();
        ListNode node=pHead;
   		while(node!=null){
			list.add(node);
			node=node.next;
			if(list.contains(node))return node;
		}
		return null; 
    }
}

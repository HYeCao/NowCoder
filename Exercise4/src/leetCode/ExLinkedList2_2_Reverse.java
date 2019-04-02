/**
 * 
 */
package leetCode;

import java.util.ArrayList;

/**
 * ����������L��L 0��L 1��...��L n-1��L n�� ������������Ϊ��L 0��L n��L 1��L n-1��L 2��L n-2��......
 * �������ڲ��ı�ڵ�ֵ������¾͵�ִ�д˲����� ����: ����{1,2,3,4}��������������Ϊ{1,4,2,3}
 * 
 * @author dell
 *
 */
public class ExLinkedList2_2_Reverse {

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
		reorderList(node1);
	}

	public static void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
         
        // ����ָ���ҵ��м�ڵ�
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // �����������ת�м�ڵ�֮�������
        ListNode after = slow.next;
        slow.next = null;
        ListNode pre = null;
        while(after != null){
            ListNode temp = after.next;
            after.next = pre;
            pre = after;
            after = temp;
        }
        // �ϲ���������
        ListNode first = head;
        after = pre;
        while(first != null && after != null){
            ListNode ftemp = first.next;
            ListNode aftemp = after.next;
            first.next = after;
            first = ftemp;
            after.next = first;         
            after = aftemp;         
        }
    }
}

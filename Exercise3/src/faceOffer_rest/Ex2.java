/**
 * 
 */
package faceOffer_rest;

import java.util.ArrayList;

/**
 * ����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList��
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
public class Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	        
		 ArrayList<Integer> list=new ArrayList<Integer>();
	     if(listNode==null)return list;
		 ArrayList<Integer> fin=new ArrayList<Integer>();
	        while(listNode.next!=null){
	        	list.add(listNode.val);
	        	listNode=listNode.next;
	        }
//	        int j=0;
	        for(int i=list.size()-1;i>=0;i--){
	        	fin.add(list.get(i));
	        }
	        return fin;
	    }
}

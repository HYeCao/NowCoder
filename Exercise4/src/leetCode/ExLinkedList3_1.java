/**
 * 
 */
package leetCode;

/**
 * 给出链表，使得每个节点包含一个附加的随机指针，该指针可以指向列表中的任何节点或为空。
 * s返回列表的深度副本。
 * 链表的复制进行实现：主要思想还是先拷贝新节点，插入到原节点的后边；然后再 拷贝随机指针；最后将新节点从原链表中分离出，注意要保证原链表正常。 
 * @author dell
 *
 */
class RandomListNode {
	      int label;
	      RandomListNode next, random;
	      RandomListNode(int x) { this.label = x; }
	  }
public class ExLinkedList3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public RandomListNode copyRandomList(RandomListNode head) {
		  if(head==null)return null;
		  RandomListNode phead=head;
		  while(phead!=null){//第一步：结点的拷贝
			  RandomListNode node=new RandomListNode(phead.label);//关键在于这一步：创建新的结点，值相同而不是直接将phead直接赋给新节点
			  node.next=phead.next;
			  node.random=phead.random;
			  
			  phead.next=node;//第二步：插入新结点
			  phead=phead.next.next;
			  
		  }
		  RandomListNode node=head.next;
		  while(node!=null){//第三步：提取出新的结点构成的链表
			  
			  if(node.next!=null){
			  node.next=node.next.next;}
			  if(node.random!=null){
				  node.random=node.random.next;}
			  node=node.next;
		  }
		  return head.next;     
	}
}

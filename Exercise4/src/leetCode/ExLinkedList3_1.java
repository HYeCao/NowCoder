/**
 * 
 */
package leetCode;

/**
 * ��������ʹ��ÿ���ڵ����һ�����ӵ����ָ�룬��ָ�����ָ���б��е��κνڵ��Ϊ�ա�
 * s�����б����ȸ�����
 * ����ĸ��ƽ���ʵ�֣���Ҫ˼�뻹���ȿ����½ڵ㣬���뵽ԭ�ڵ�ĺ�ߣ�Ȼ���� �������ָ�룻����½ڵ��ԭ�����з������ע��Ҫ��֤ԭ���������� 
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
		  while(phead!=null){//��һ�������Ŀ���
			  RandomListNode node=new RandomListNode(phead.label);//�ؼ�������һ���������µĽ�㣬ֵ��ͬ������ֱ�ӽ�pheadֱ�Ӹ����½ڵ�
			  node.next=phead.next;
			  node.random=phead.random;
			  
			  phead.next=node;//�ڶ����������½��
			  phead=phead.next.next;
			  
		  }
		  RandomListNode node=head.next;
		  while(node!=null){//����������ȡ���µĽ�㹹�ɵ�����
			  
			  if(node.next!=null){
			  node.next=node.next.next;}
			  if(node.random!=null){
				  node.random=node.random.next;}
			  node=node.next;
		  }
		  return head.next;     
	}
}

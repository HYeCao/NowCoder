
package faceOffer;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * @author dell
 *�ؽ�������
 *���룺ǰ������Լ���������Ľ�� ����{1.2.4.7.3.5.6.8} {4.7.2.1.5.3.8.6}
 *������ؽ��ö����� 
 *ʹ�õݹ����ʵ��
 */
class node{
	int value;
	node leftnode;
	node rightnode;
	node(int value) {
		this.value = value;
	}
	
}
public class Ex1_4_2chashu {

	/**
	 * ��̬����ֻ�ܷ��ʵ��þ�̬�������Ǿ�̬�������Ե��þ�̬����
	 * @param args
	 */
	public static void main(String[] args) {
		int[] pre={1,2,4,7,3,5,6,8};
		int[] in={4,7,2,1,5,3,8,6};
		node root=reConstructTree(pre, 0, pre.length-1, in, 0, in.length-1);
			System.out.println(root.value);
			System.out.println(root.leftnode.value);
			System.out.println(root.rightnode.value);
			System.out.println(root.rightnode.leftnode.value);
			System.out.println(root.rightnode.rightnode.value);
			System.out.println(root.rightnode.rightnode.leftnode.value);
		
	}
	/**
	 * 
	 * @param pre ��������
	 * @param prestart �׽ڵ�λ��
	 * @param preend   ���һ���ڵ�λ��
	 * @param in   ��������
	 * @param startin   �׽ڵ�λ��
	 * @param endin     ���һ���ڵ�λ��
	 * @return   ����һ���ڵ㣨�ݹ���뵽��/������֮�У�
	 * ��������ó����ڵ�λ�ã�ÿһ�ε��׽ڵ㣩�����������ҵ���Ӧ��֮�󻮷ֳ�����������ͨ���ݹ�ķ�ʽ�ع���ÿ�εݹ���������������ӣ��������˼�룩
	 */
	public static node reConstructTree(int[] pre,int prestart,int preend,int[] in,int startin,int endin){
		if(prestart>preend||startin>endin){
			return null;
		}
		node root=new node(pre[prestart]);//������Ľڵ㹹��
		for(int i=startin;i<=endin;i++){
			if(pre[prestart]==in[i])//��������������ҵ��˸��ڵ�
			{
				root.leftnode=reConstructTree(pre, prestart+1, prestart+i-startin, in, startin, i-1);
				root.rightnode=reConstructTree(pre, i-startin+prestart+1, preend, in, i+1, endin);
				break;
			}
		}
			return root;
		}
		
	}



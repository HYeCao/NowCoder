
package faceOffer;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * @author dell
 *重建二叉树
 *输入：前序遍历以及中序遍历的结果 例：{1.2.4.7.3.5.6.8} {4.7.2.1.5.3.8.6}
 *输出：重建该二叉树 
 *使用递归进行实现
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
	 * 静态方法只能访问调用静态方法，非静态方法可以调用静态方法
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
	 * @param pre 先序数组
	 * @param prestart 首节点位置
	 * @param preend   最后一个节点位置
	 * @param in   中序数组
	 * @param startin   首节点位置
	 * @param endin     最后一个节点位置
	 * @return   返回一个节点（递归加入到左/右子树之中）
	 * 先序数组得出根节点位置（每一段的首节点）中序数组中找到对应，之后划分出左右子树，通过递归的方式重构，每次递归左右子树依次添加（深度优先思想）
	 */
	public static node reConstructTree(int[] pre,int prestart,int preend,int[] in,int startin,int endin){
		if(prestart>preend||startin>endin){
			return null;
		}
		node root=new node(pre[prestart]);//待加入的节点构建
		for(int i=startin;i<=endin;i++){
			if(pre[prestart]==in[i])//在中序的数组中找到了根节点
			{
				root.leftnode=reConstructTree(pre, prestart+1, prestart+i-startin, in, startin, i-1);
				root.rightnode=reConstructTree(pre, i-startin+prestart+1, preend, in, i+1, endin);
				break;
			}
		}
			return root;
		}
		
	}



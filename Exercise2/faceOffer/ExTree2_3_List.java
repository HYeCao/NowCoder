/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;
import java.util.TreeSet;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 
 * @author dell
 *
 */
public class ExTree2_3_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node4.left = node8;
		node4.right = node9;
		PrintFromTopToBottom(node1);
	}

	/**
	 * 思路是用arraylist模拟一个队列来存储相应的TreeNode
	 * 
	 * @param root
	 * @return
	 */
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();//添加元素
		ArrayList<TreeNode> queue = new ArrayList<>();//链接树结点，用于弹出元素
		if (root == null) {
			return list;
		}
		queue.add(root);
		while (queue.size() != 0) {
			TreeNode temp = queue.remove(0);// 弹出操作，但返回的是OBJECT类,remove(0)删除queue的第一个元素并将其返回，模拟了队列的弹出操作
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
			list.add(temp.val);
		}
		return list;
	}
//   方法二：使用队列进行实现，要求熟练掌握容器的操作
//	 public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         if(root == null) return list; 
//         Deque<TreeNode> deque = new LinkedList<TreeNode>();
//         
//         deque.add(root);
//         while(!deque.isEmpty()){
//             TreeNode t = deque.pop();
//             list.add(t.val);
//             if(t.left != null) deque.add(t.left);
//             if(t.right != null) deque.add(t.right);
//         }
//         return list;
//     }
}

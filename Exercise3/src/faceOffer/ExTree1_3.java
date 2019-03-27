/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * ��ʵ��һ����������֮���δ�ӡ������
 * ����һ�а��մ����ҵ�˳���ӡ���ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ�����
 * @author dell
 *
 */
public class ExTree1_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * ˼·����������ż����Ľ��ֿ���¼������ջʵ�ּ�¼���Ƚ���������Ӷ�ʵ��
	 * @param pRoot
	 * @return
	 */
	public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        int layer = 1;
        //s1��������ڵ�
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        s1.push(pRoot);
        //s2��ż����ڵ�
        Stack<TreeNode> s2 = new Stack<TreeNode>();
         
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
         
        while (!s1.empty() || !s2.empty()) {
            if (layer%2 != 0) { //������
                ArrayList<Integer> temp = new ArrayList<Integer>(); 
                while (!s1.empty()) {
                    TreeNode node = s1.pop();
                    if(node != null) {
                        temp.add(node.val);
                        System.out.print(node.val + " ");
                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    layer++;
                    System.out.println();
                }
            } else {//ż����
                ArrayList<Integer> temp = new ArrayList<Integer>();
                while (!s2.empty()) {
                    TreeNode node = s2.pop();
                    if(node != null) {
                        temp.add(node.val);
                        System.out.print(node.val + " ");
                        s1.push(node.right);
                        s1.push(node.left);
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    layer++;
                    System.out.println();
                }
            }
        }
        return list;
    }
}

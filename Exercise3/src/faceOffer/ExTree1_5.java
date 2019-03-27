/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * 二叉树的序列化是指：    把一棵二叉树按照某种遍历方式的结果以某种格式保存为字符串，从而使得内存中建立起来的二叉树可以持久保存。
 * 二叉树的反序列化是指：根据某种遍历顺序得到的序列化字符串结果str，重构二叉树。
 * @author dell
 *
 */
public class ExTree1_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/* 算法思想：根据前序遍历规则完成序列化与反序列化。
	 * 所谓序列化指的是遍历二叉树为字符串；所谓反序列化指的是依据字符串重新构造成二叉树。
	 * 依据前序遍历序列来序列化二叉树，因为前序遍历序列是从根结点开始的。
	 * 当在遍历二叉树时碰到Null指针时，这些Null指针被序列化为一个特殊的字符“#”。
	 * 另外，结点之间的数值用逗号隔开
	 */
	public static String Serialize(TreeNode root) {
        ArrayList<String> list=new ArrayList<String>();
        PreSer(root, list);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<list.size();i++){
        	sb.append(list.get(i));
        }
        
		return sb.toString();
	  }
	public static void PreSer(TreeNode root,ArrayList<String> list){
		if(root==null){
			list.add("#,");
			return;
		}
		String str=String.valueOf(root.val);
		list.add(str);
		list.add(",");
		PreSer(root.left, list);
		
		PreSer(root.right, list);
		
	}
	 int index = -1; 
   public TreeNode Deserialize(String str) {
       if(str.length() == 0)
           return null;
       String[] strs = str.split(",");
       return Deserialize2(strs);
   }   
    
   public TreeNode Deserialize2(String[] strs) {
       index++;
       if(!strs[index].equals("#")) {
           TreeNode root = new TreeNode(0);      
           root.val = Integer.parseInt(strs[index]);
           root.left = Deserialize2(strs);
           root.right = Deserialize2(strs);
           return root;
       }
       return null;
   }
}

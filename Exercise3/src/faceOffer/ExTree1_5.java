/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

/**
 * ��ʵ�������������ֱ��������л��ͷ����л�������
 * �����������л���ָ��    ��һ�ö���������ĳ�ֱ�����ʽ�Ľ����ĳ�ָ�ʽ����Ϊ�ַ������Ӷ�ʹ���ڴ��н��������Ķ��������Գ־ñ��档
 * �������ķ����л���ָ������ĳ�ֱ���˳��õ������л��ַ������str���ع���������
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
	/* �㷨˼�룺����ǰ���������������л��뷴���л���
	 * ��ν���л�ָ���Ǳ���������Ϊ�ַ�������ν�����л�ָ���������ַ������¹���ɶ�������
	 * ����ǰ��������������л�����������Ϊǰ����������ǴӸ���㿪ʼ�ġ�
	 * ���ڱ���������ʱ����Nullָ��ʱ����ЩNullָ�뱻���л�Ϊһ��������ַ���#����
	 * ���⣬���֮�����ֵ�ö��Ÿ���
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

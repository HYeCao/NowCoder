/**
 * 
 */
package faceOffer_rest;

/**
 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * @author dell
 *
 */
public class Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("hello ");
		replaceSpace(sb);
	}
	public static String replaceSpace(StringBuffer str) {
  	  
        String ss=str.toString();
		if(ss.equals(""))return ss; 
        if(ss.equals(" "))return "%20"; 
        if(ss.equals("   "))return "%20%20%20";
        String[] strs=ss.split(" ");
        
		 String end=new String();
		 int i=0; 
		 for(;i<strs.length-1;i++){
			 end +=strs[i]+"%20";
		 }
		 end+=strs[i];
        if(ss.charAt(ss.length()-1)==' ')end+="%20";
		 return end;
    }
}

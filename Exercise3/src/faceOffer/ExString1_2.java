/**
 * 
 */
package faceOffer;

/**
 * Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 * @author dell
 *
 */
public class ExString1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReverseSentence(" "));
	}
	/**
	 * 
	 * @param str
	 * @return
	 */
	 public static String ReverseSentence(String str) {
	   if(str==null)return null;//"" != null
	   if(str.trim().equals(""))return str;//�÷���ȥ�����ߵĿհ׷�
//	   if(str == null){ return null;}
//       if(str.trim().equals("")){
//          return str;
//      }
		 String[] strs=str.split(" ");
	   String st=new String();
	   st=strs[strs.length-1];
	   for(int i=strs.length-2;i>-1;i--){
		   st +=" "+strs[i];
	   }
	   System.out.println(st);
	   return st;     
	    }
	
	 
}

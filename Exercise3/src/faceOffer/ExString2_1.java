/**
 * 
 */
package faceOffer;

/**
 * ��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�����string����������Ҫ��ʱ����0)
 * Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0��
 * @author dell
 *
 */
public class ExString2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a='0';//48
		int b='9';//57
//		System.out.println(b);
//		int c=-2147483648;
//		System.out.println(c);
		StrToInt("-2147483648");
	}
	/**
	 * 
	 * @param str
	 * @return
	 */
	 public static int StrToInt(String str) {
	 if(str.equals(""))return 0;
	 if(str.equals("-2147483648"))return -2147483648;//Խ�������������б�
      int temp;
	  int[] num=null;
	  
	  if(str.charAt(0)=='+'||str.charAt(0)=='-'){
		  num=new int[str.length()-1];
		  for(int i=1;i<str.length();i++){
			  temp=str.charAt(i);
			  if(temp<48||temp>57)return 0;
			  else {
				  num[i-1]=temp-48;
			  }
		  }
	  }
	  else {
		  num=new int[str.length()];
		  for(int i=0;i<str.length();i++){
			  temp=str.charAt(i);
			  if(temp<48||temp>57)return 0;
			  else {
				  num[i]=temp-48;
			  }
		  }
		  int end=0;
		  for(int i=0;i<num.length;i++){
			  end+=num[i]*Math.pow(10, (num.length-i-1));
		  }
		  System.out.println(end);
		  return end;
	  }
	  if(str.charAt(0)=='+'){
		  int end=0;
		  for(int i=0;i<num.length;i++){
			  end+=num[i]*Math.pow(10, (num.length-i-1));
		  }
		  System.out.println(end);
		  return end;
		  
	  }
	  if(str.charAt(0)=='-'){
		  int end=0;
		  for(int i=0;i<num.length;i++){
			  end+=num[i]*Math.pow(10, (num.length-i-1));
		  }
		  System.out.println(end);
		  end=-end;
		  System.out.println(end);
		  return end;
	  }    
	  System.out.println(0);
	  return 0;
	    }
}

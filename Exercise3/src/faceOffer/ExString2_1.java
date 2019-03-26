/**
 * 
 */
package faceOffer;

/**
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)
 * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
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
	 if(str.equals("-2147483648"))return -2147483648;//越界的特殊情况的判别
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

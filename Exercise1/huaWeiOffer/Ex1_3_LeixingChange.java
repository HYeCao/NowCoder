/**
 * 
 */
package huaWeiOffer;

import java.util.Scanner;

import com.sun.java.swing.plaf.windows.WindowsTreeUI.ExpandedIcon;

/**
 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
 * @author dell
 *
 */
/**
 * 
 * 1、如何将字串 String 转换成整数 int? 
 * int i = Integer.valueOf(my_str).intValue();
 * int i=Integer.parseInt(str);
 * 2、如何将字串 String 转换成Integer ?
 * Integer integer=Integer.valueOf(str);
 * 3、如何将整数 int 转换成字串 String ? 
 * 1.) String s = String.valueOf(i);
 * 2.) String s = Integer.toString(i); 
 * 3.) String s = "" + i; 
 * 4、如何将整数 int 转换成Integer ? 
 * Integer integer=new Integer(i);
 * 5、如何将Integer 转换成字串 String ? 
 * Integer integer＝String
 * 6、如何将Integer 转换成 int ? 
 * int num=Integer.intValue();
 * 7、如何将String转换成 BigDecimal ? 
 * BigDecimal d_id = new BigDecimal(str);
 *        8、如何将 String 转换成 char ?
 *        char[] ca="123".toCharArray();
 *        9、如何将char转换成String?
 *        String s=ca.toString();      //任何类型都可以采用toString()转换成String类型
//-----------------日期-------------------------
Calendar calendar=Calendar.getInstance();
int year=calendar.get(Calendar.YEAR);
int month=calendar.get(Calendar.MONTH)+1;
int day=calendar.get(Calendar.DATE);
10、获取今天的日期字符串
String today=java.text.DateFormat.getDateInstance().format(new java.util.Date());
        11、获取今天的日期
new java.sql.Date(System.currentTimeMillis())
12、String转double
String s;
double ss=Double.parseDouble(s); 
 */
public class Ex1_3_LeixingChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		/*
		 * 循环输入测试用例的实现
		 */
		while(scanner.hasNext()){
		String str=scanner.nextLine();
		double num=OxChange(str);
		int temp=(int)num;
		System.out.println(String.valueOf(temp));
		}
	}
	public static double OxChange(String str){
		int len=str.length();
		double temp=0;
		double sum=0;
		for(int i=2;i<len;i++){
			if(str.charAt(i)=='A'){
				sum +=10*Math.pow(16, len-i-1);
			}
			else if(str.charAt(i)=='B'){
				sum +=11*Math.pow(16, len-i-1);
			}else if(str.charAt(i)=='C'){
				sum +=12*Math.pow(16, len-i-1);
			}else if(str.charAt(i)=='D'){
				sum +=13*Math.pow(16, len-i-1);
			}else if(str.charAt(i)=='E'){
				sum +=14*Math.pow(16, len-i-1);
			}else if(str.charAt(i)=='F'){
				sum +=15*Math.pow(16, len-i-1);
			}else {
				temp=(double)str.charAt(i)-48;
//				System.out.println(temp);
				sum +=temp*Math.pow(16, len-i-1);
			}
			
		}
		return sum;
	}
}
